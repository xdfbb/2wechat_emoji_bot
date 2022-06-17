package com.smt.scraper;

import com.smt.persistence.WechatAcc;
import com.smt.persistence.WechatAccJpaRepository;
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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
public class WechatAccScraper extends FiveDoubleOneEightScraper {
    private Logger logger = LoggerFactory.getLogger(WechatAccScraper.class);

    @Value("${5118.wechatAcc.max}")
    private int maxCount;

    private String wechatRankingUrl = "https://yx.5118.com/api/drainage/weixin";
    private String referal = "https://yx.5118.com/traffic/weixin";

    private List<WechatAcc> wechatAccts = new ArrayList<>();

    @Autowired
    WechatAccJpaRepository wechatAccJpaRepository;

    @Scheduled(cron = "0 0 1 * * ?")
    //每天凌晨1点执行
    public void execute() {
        logger.info("Job wechat account scraper started at {}", formatter.format(Calendar.getInstance().getTime()));
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
            logger.error("Api endpoint test failed, exiting the job. Reset total count to {}", totalCount);
        }
    }


    private void addRecord(int from, int size) {
        makeWechatAccRequest(from, size);
        int code = response.getStatus();
        if (200 == code) {
            logger.info(response.getBody().toPrettyString());
        }

        JSONArray resultList = response
                .getBody()
                .getObject()
                .getJSONObject("data")
                .getJSONArray("firestList");
        if (resultList.iterator().hasNext()) {
            resultList.forEach(s -> addWechatAcc(wechatAccts, s.toString()));
        }
    }

    private void makeWechatAccRequest(int from, int size) {
        response = Unirest.get(wechatRankingUrl)
                .header("Authorization", authToken)
                .header("Cookie", cookie)
                .header("Accept", contentType)
                .header("Referer", referal)
                .header("User-Agent", userAgent)
                .queryString("word", keyword)
                .queryString("index_t", "0")
                .queryString("index_p", "0")
                .queryString("index_p_c", "0")
                .queryString("index_w", "0")
                .queryString("index_w_c", "0")
                .queryString("index_t_r", "0")
                .queryString("hot", "0")
                .queryString("hasdata", -1)
                .queryString("match_exact", "999999")
                .queryString("match_fuzzy", "999999")
                .queryString("ptid", -1)
                .queryString("tid", -1)
                .queryString("sort", "index_t%7Cdesc")
                .queryString("from", from)
                .queryString("size", size)
                .queryString("isSearch", -1)
                .asJson();
    }

    @Transactional
    void addWechatAcc(List<WechatAcc> wechatAccts, String json) {
        WechatAcc wechatAcc = gson.fromJson(json, WechatAcc.class);
        wechatAccts.add(wechatAcc);
        logger.info("appid: " + wechatAcc.getAppID());
        WechatAcc wechatAccFromDB = wechatAccJpaRepository.findByAppID(wechatAcc.getAppID());

        if (null == wechatAccFromDB) {
            logger.info("find new appid, adding record with appid " + wechatAcc.getAppID());
            wechatAcc.setRanking(from);
            wechatAccJpaRepository.save(wechatAcc);
        } else {
            logger.info("find existing appid, update the entity for WechatAcc with id " + wechatAcc.getAppID());
            BeanUtils.copyProperties(wechatAcc, wechatAccFromDB, "id", "version", "dateCreated", "lastModified", "disabled", "deleted", "appID");
            wechatAccFromDB.setRanking(from);
            wechatAccJpaRepository.save(wechatAccFromDB);
        }
        totalCount++;
    }
}
