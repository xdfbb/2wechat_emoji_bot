package com.smt.scraper;

import com.smt.persistence.ZhiHu;
import com.smt.persistence.ZhiHuJpaRepository;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class ZhihuScraper extends FiveDoubleOneEightScraper {
    private Logger logger = LoggerFactory.getLogger(ZhihuScraper.class);
    private List<ZhiHu> zhiHuList = new ArrayList<>();

    @Value("${5118.zhihuAcc.max}")
    private int maxCount;

    String zhihuRankingUrl = "https://yx.5118.com/api/drainage/ZhiHuV";
    String referal = "https://yx.5118.com/api/drainage/ZhiHuV";

    @Autowired
    private ZhiHuJpaRepository zhiHuJpaRepository;


    @Scheduled(cron = "0 0 7 * * ?")
    //每天早晨7点执行
    private void execute() {
        logger.info("Job zhihu account scraper started at {}", formatter.format(Calendar.getInstance().getTime()));
        response = Unirest.get(testUrl).asJson();
        if ((null != response && response.getStatus() == 200) || null == response.getBody()) {
            while (from <= maxCount) {
                threadSleep("1-60");
                addRecord(from, size);
                from = from + size;
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


    private void addRecord(int from, int size) {
        makeZhiHuRequest();
        int code = response.getStatus();
        if (200 == code) {
            logger.info(response.getBody().toPrettyString());
        }
        String resultStr = response.getBody()
                .getObject()
                .getJSONObject("data")
                .get("result").toString();
        JSONObject jsonObject = new JSONObject(resultStr);
        JSONArray resultList = jsonObject.getJSONArray("hits");
        if (resultList.iterator().hasNext()) {
            resultList.forEach(s -> addZhiHuAcc(zhiHuList, s.toString()));
        }
    }

    private void makeZhiHuRequest() {
        response = Unirest.get(zhihuRankingUrl)
                .header("Authorization", authToken)
                .header("Cookie", cookie)
                .header("Accept", contentType)
                .header("Referer", referal)
                .header("User-Agent", userAgent)
                .queryString("name", keyword)
                .queryString("type", "praise")
                .queryString("from", from)
                .queryString("size", size)
                .queryString("keyword_count", 0)
                .queryString("keyword_count_c", 0)
                .asJson();
    }

    @Transactional
    void addZhiHuAcc(List<ZhiHu> zhiHuList, String json) {
        ZhiHu zhiHu = gson.fromJson(json, ZhiHu.class);
        zhiHuList.add(zhiHu);
        logger.info("zhiHuId: " + zhiHu.getId());
        ZhiHu zhihuFromDB = zhiHuJpaRepository.findByID(zhiHu.getId());
        if (null == zhihuFromDB) {
            logger.info("find new zhihu Id, adding record with zhihu Id " + zhiHu.getId());
            zhiHu.setRanking(zhiHu.getLike());
            zhiHuJpaRepository.save(zhiHu);
        } else {
            logger.info("find existing appid, update the entity for app with id " + zhihuFromDB.getId());
            BeanUtils.copyProperties(zhiHu, zhihuFromDB, "id", "version", "dateCreated", "lastModified", "disabled", "deleted");
            zhihuFromDB.setRanking(zhiHu.getLike());
            zhiHuJpaRepository.save(zhihuFromDB);
        }
        totalCount++;
    }
}
