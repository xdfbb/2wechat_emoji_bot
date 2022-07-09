package com.smt.scraper;

import com.smt.persistence.WechatAppletJpaRepository;
import com.smt.persistence.WeixinApplet;
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
public class WechatAppletScraper extends FiveDoubleOneEightScraper {
    private Logger logger = LoggerFactory.getLogger(WechatAppletScraper.class);
    private List<WeixinApplet> weixinApplets = new ArrayList<>();

    @Value("${5118.wechatMiniPAcc.max}")
    private int maxCount;

    private String wechatMiniPRankingUrl = "https://yx.5118.com/api/drainage/WeixinApplet";
    private String referal = "https://yx.5118.com/traffic/xcx";

    @Autowired
    private WechatAppletJpaRepository wechatAppletJpaRepository;


    @Scheduled(cron = "0 0 4 * * ?")
    @PostConstruct
    //每天凌晨4点执行
    private void execute() {
        logger.info("Job wechat mini-program account scraper started at {}", formatter.format(Calendar.getInstance().getTime()));
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
        makeWechatMiniPRequest(from, size);
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
            resultList.forEach(s -> addWechatAcc(weixinApplets, s.toString()));
        }
    }

    private void makeWechatMiniPRequest(int from, int size) {
        response = Unirest.get(wechatMiniPRankingUrl)
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
    void addWechatAcc(List<WeixinApplet> wechatAccts, String json) {
        WeixinApplet weixinApplet = gson.fromJson(json, WeixinApplet.class);
        wechatAccts.add(weixinApplet);
        logger.info("appid: " + weixinApplet.getAppID());
        WeixinApplet wechatAppletFromDB = wechatAppletJpaRepository.findByAppID(weixinApplet.getAppID());
        if (null == wechatAppletFromDB) {
            logger.info("find new appid, adding record with appid " + weixinApplet.getAppID());
            weixinApplet.setRanking(from);
            wechatAppletJpaRepository.save(weixinApplet);
        } else {
            logger.info("find existing appid, update the ranking for app with id " + wechatAppletFromDB.getAppID());
            BeanUtils.copyProperties(weixinApplet, wechatAppletFromDB, "id", "version", "dateCreated", "lastModified", "disabled", "deleted", "appID");
            wechatAppletFromDB.setRanking(from);
            wechatAppletJpaRepository.save(wechatAppletFromDB);
        }
        totalCount++;
    }

}
