package com.smt.scraper;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.smt.persistence.CiLiuTiArticel;
import com.smt.persistence.CiLiuTiJpaRepository;
import io.swagger.api.AdminControllerApi;
import io.swagger.api.PostControllerApi;
import io.swagger.model.AuthWrapper;
import io.swagger.model.LoginParam;
import io.swagger.model.PostDetailVO;
import io.swagger.model.PostParam;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

@Component
public class CiLiuTiHealthCollector extends FiveDoubleOneEightScraper {
    private Logger logger = LoggerFactory.getLogger(CiLiuTiHealthCollector.class);
    private List<CiLiuTiArticel> ciLiuTiArticels = new ArrayList<>();
    String ciLiuTiUrl = "http://apis.ciliuti.com/ciliuti";
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
    SimpleDateFormat paraFormatter = new SimpleDateFormat("yyyy-MM-dd");
    private String projectId="d8d3c872-15f9-ec11-8dbb-c81f66f777c4";

    @Value("${5118.api.auth}")
    private String apiAuthToken;
    @Value("${5118.api.project.related_words}")
    private String relatedWords;
    @Value("${5118.ciLiuTi.max}")
    private int maxCount;
    @Value("${jiaomao.admin.authorization}")
    private String jiaoMaoAuth;
    @Value("${jiaomao.api.url}")
    private String jiaoMaoUrl;
    @Value("${jiaomao.admin.user}")
    private String jiaoMaoAdminUser;
    @Value("${jiaomao.admin.password}")
    private String jiaoMaoAdminPassword;
    @Autowired
    CiLiuTiJpaRepository ciLiuTiJpaRepository;

    int from = 1;
    PostControllerApi postControllerApi;

    @Scheduled(cron = "0 0 14 * * ?")
    //每天下午14点执行
    public void execute() {

        //post apis
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);

        AdminControllerApi adminControllerApi = JAXRSClientFactory.create(jiaoMaoUrl, AdminControllerApi.class, providers);
        WebClient.client(adminControllerApi).accept(MediaType.APPLICATION_JSON_TYPE);

        LoginParam loginParam = new LoginParam();
        loginParam.setUsername(jiaoMaoAdminUser);
        loginParam.setPassword(jiaoMaoAdminPassword);

        AuthWrapper authToken = adminControllerApi.authUsingPOST(loginParam);

        postControllerApi = JAXRSClientFactory.create(jiaoMaoUrl, PostControllerApi.class, providers);
        WebClient.client(postControllerApi).accept(MediaType.APPLICATION_JSON_TYPE);
        WebClient.client(postControllerApi).header("ADMIN-Authorization", authToken.getAuthToken().getAccessToken());
        WebClient.client(postControllerApi).header("Content-Type", "application/json");
        WebClient.client(postControllerApi).header("Accept", "application/json");

        logger.info("Job Ci Liu Ti Collector started at {}", formatter.format(Calendar.getInstance().getTime()));
        response = Unirest.get(testUrl).asJson();
        if ((null != response && response.getStatus() == 200) || null == response.getBody()) {
            while (from * size <= maxCount) {
                threadSleep("1-60");
                addRecord();
                from = from + 1;
                logger.info("Received records from  {} with size {}, total count now is {}", from, size, totalCount);
            }
            logger.info("Max number of records retrieved, exiting the job at total count = {}", totalCount);
            totalCount = 0;
            from = 0;
        } else {
            totalCount = 0;
            from = 0;
            logger.error("Api endpoint test failed, exiting the job.....");
        }
    }


    private void addRecord() {
        makeCiLiuTiRequest();
        int code = response.getStatus();

        if (200 == code) {
            logger.info(response.getBody().toPrettyString());
        }

        JSONArray resultList = response
                .getBody()
                .getObject()
                .getJSONObject("data")
                .getJSONArray("data");

        maxCount = response
                .getBody()
                .getObject()
                .getJSONObject("data").getInt("total");

        resultList.forEach(s -> addCiLiuTiAcc(ciLiuTiArticels, s.toString()));
    }

    private void makeCiLiuTiRequest() {
        Calendar yesterday = Calendar.getInstance();
        yesterday.add(Calendar.DATE, -1);

        response = Unirest.post(ciLiuTiUrl)
                .header("Authorization", apiAuthToken)
                .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
                .field("project_guid", projectId)
                .field("page_index", String.valueOf(from))
                .field("page_size", String.valueOf(size))
                .field("end_add_time", paraFormatter.format(Calendar.getInstance().getTime()))
                .field("start_add_time", paraFormatter.format(yesterday.getTime()))
                .asJson();
    }

    @Transactional
    void addCiLiuTiAcc(List<CiLiuTiArticel> ciLiuTiArticels, String json) {
        CiLiuTiArticel ciLiuTiArticel = gson.fromJson(json, CiLiuTiArticel.class);
        logger.info("磁流体 article Id: " + ciLiuTiArticel.getData_id());
        CiLiuTiArticel ciLiuTiArticelFromDB = ciLiuTiJpaRepository.findByDataID(ciLiuTiArticel.getData_id());
        if (null == ciLiuTiArticelFromDB) {
            logger.info("find new article, adding record with article id " + ciLiuTiArticel.getData_id());
            ciLiuTiJpaRepository.save(ciLiuTiArticel);
        } else {
            logger.info("find existing data id, update the entity for app with id " + ciLiuTiArticelFromDB.getData_id());
            BeanUtils.copyProperties(ciLiuTiArticel, ciLiuTiArticelFromDB, "id", "version", "dateCreated", "lastModified", "disabled", "deleted", "data_id");
            ciLiuTiJpaRepository.save(ciLiuTiArticelFromDB);
        }
        createJiaoMaoPosts(ciLiuTiArticel);

        totalCount++;
    }

    private void createJiaoMaoPosts(CiLiuTiArticel ciLiuTiArticel) {
        String contentTitle = ciLiuTiArticel.getTitle();
        PostParam post = new PostParam();
        post.setTitle(contentTitle);
        post.setContent(ciLiuTiArticel.getContent());
        post.setOriginalContent(ciLiuTiArticel.getContent());
        post.setStatus(PostParam.StatusEnum.PUBLISHED);
        post.setKeepRaw(true);
        List<Integer> categoryIds = new ArrayList<>();
        categoryIds.add(12);
        post.setCategoryIds(categoryIds);
        List<Integer> tagIds = new ArrayList<>();
        tagIds.add(5);
        post.setTagIds(tagIds);
        post.setSummary(contentTitle);
        post.setCreateTime(ciLiuTiArticel.getPublish_time());
        Set imgStr = getImgStr(ciLiuTiArticel.getContent());
        String imgUrl = getThumbnail(imgStr);
        post.setThumbnail(imgUrl);
        try {
            PostDetailVO result = postControllerApi.createByUsingPOST7(post, true);
        } catch (BadRequestException ex) {
            logger.error("ERROR CREATING CONTENT WITH : {}, the content might already exists.{}", contentTitle, ex.toString());
        } catch (Exception ex) {
            logger.error("ERROR CREATING CONTENT WITH : {}, {}", contentTitle, ex.toString());
        }

    }
}
