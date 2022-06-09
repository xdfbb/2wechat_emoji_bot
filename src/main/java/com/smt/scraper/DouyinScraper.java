package com.smt.scraper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.smt.persistence.DouYin;
import com.smt.persistence.DouYinJpaRepository;
import kong.unirest.Unirest;
import kong.unirest.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class DouyinScraper extends FiveDoubleOneEightScraper {
    private Logger logger = LoggerFactory.getLogger(DouyinScraper.class);
    private List<DouYin> douYinList = new ArrayList<>();

    @Value("${5118.douYinAcc.max}")
    private int maxCount = 0;
    String douyinRankingUrl = "https://yx.5118.com/api/videos/DouyinCodeList";
    String referal = "https://yx.5118.com/douyin/search/?keyword=南阳";
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    String keyword = "33697535";

    @Autowired
    DouYinJpaRepository douYinJpaRepository;


    @Scheduled(cron = "0 0 10 * * ?")
    //每天上午10点执行
    public void execute() {
        logger.info("Job douyin account scraper started at {}", formatter.format(Calendar.getInstance().getTime()));
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
        makeDouYinRequest();
        int code = response.getStatus();
        if (200 == code) {
            logger.info(response.getBody().toPrettyString());
        }

        JSONArray resultList = response
                .getBody()
                .getObject()
                .getJSONObject("data")
                .getJSONObject("result")
                .getJSONArray("hits");
        if (resultList.iterator().hasNext()) {
            resultList.forEach(s -> addDouyinAcc(douYinList, s.toString()));
        }
    }

    private void makeDouYinRequest() {
        response = Unirest.get(douyinRankingUrl)
                .header("Authorization", authToken)
                .header("Cookie", cookie)
                .header("Accept", contentType)
                .header("Referer", referal)
                .header("User-Agent", userAgent)
                .queryString("SearchText", keyword)
                .queryString("searchType", "douyinname")
                .queryString("pageIndex", "1")
                .queryString("praise", "0")
                .queryString("comment", "0")
                .queryString("from", from)
                .queryString("size", size)
                .queryString("cateid", -1)
                .queryString("video_count", 0)
                .queryString("video_count_end", 999999)
                .queryString("video_count_up", 0)
                .queryString("fans_count", 0)
                .queryString("fans_count_end", 999999)
                .queryString("following_count", 0)
                .queryString("following_count_end", 999999)
                .queryString("following_count_up", 0)
                .queryString("like_count", 0)
                .queryString("like_count_end", 999999)
                .queryString("like_count_up", 0)
                .queryString("source", 2)
                .asJson();
    }

    @Transactional
    void addDouyinAcc(List<DouYin> douYinList, String json) {
        DouYin douyin = gson.fromJson(json, DouYin.class);
        douYinList.add(douyin);
        logger.info("douyin Id: " + douyin.getDouyin_id());
        DouYin douyinFromDB = douYinJpaRepository.findByDouYinID(douyin.getDouyin_id());
        if (null == douyinFromDB) {
            logger.info("find new douyinId, adding record with douyinId " + douyin.getDouyin_id());
            douyin.setRanking(Integer.parseInt(douyin.getLike_count()));
            douyin.setQrCodeUrl("https://ext-qrcode.5118.com/qrtext/7?text=https://www.iesdouyin.com/share/user/" + douyin.getDouyin_id() + "?u_code=" + douyin.getDouyin_code());
            douYinJpaRepository.save(douyin);
        } else {
            logger.info("find existing appid, update the entity for app with id " + douyinFromDB.getDouyin_id());
            BeanUtils.copyProperties(douyin, douyinFromDB, "id", "version", "dateCreated", "lastModified", "disabled", "deleted", "douyin_id");
            douyinFromDB.setRanking(Integer.parseInt(douyin.getLike_count()));
            douyinFromDB.setQrCodeUrl("https://ext-qrcode.5118.com/qrtext/7?text=https://www.iesdouyin.com/share/user/" + douyin.getDouyin_id() + "?u_code=" + douyin.getDouyin_code());
            douYinJpaRepository.save(douyinFromDB);
        }
        totalCount++;
    }
}
