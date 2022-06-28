package com.smt.scraper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class FiveDoubleOneEightScraper {
    Logger logger = LoggerFactory.getLogger(FiveDoubleOneEightScraper.class);
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Value("${5118.auth}")
    String authToken;
    @Value("${5118.cookie}")
    String cookie;

    String contentType = "application/json, text/plain, */*";
    String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36";
    String testUrl = "https://www.5118.com/";
    String keyword = "南阳";
    Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
    HttpResponse<JsonNode> response;
    int from = 0;
    int size = 10;
    int totalCount = 0;

    void threadSleep(String time) {
        String[] split = time.split("-");
        int first = Integer.parseInt(split[0]);
        int second = Integer.parseInt(split[1]);
        try {
            long seconds = (first + (int) (Math.random() * (second - first))) * 1000;
            logger.info("Sleeping for " + seconds / 1000 + " seconds");
            Thread.sleep(seconds);
        } catch (InterruptedException interruptedException) {
            logger.info("Sleeping Error", interruptedException);
        }
    }

    Set<String> getImgStr(String htmlStr) {
        Set<String> pics = new HashSet<>();
        String img = "";
        Pattern p_image;
        Matcher m_image;
        //     String regEx_img = "<img.*src=(.*?)[^>]*?>"; //图片链接地址
        String regEx_img = "<img.*src\\s*=\\s*(.*?)[^>]*?>";
        p_image = Pattern.compile
                (regEx_img, Pattern.CASE_INSENSITIVE);
        m_image = p_image.matcher(htmlStr);
        while (m_image.find()) {
            // 得到<img />数据 不懂的qq1023732997
            img = m_image.group();
            // 匹配<img>中的src数据
            Matcher m = Pattern.compile("src\\s*=\\s*\"?(.*?)(\"|>|\\s+)").matcher(img);
            while (m.find()) {
                pics.add(m.group(1));
            }
        }
        return pics;
    }

    String getThumbnail(Set imgStrs) {
        if (!imgStrs.isEmpty()) {
            Iterator iterator = imgStrs.iterator();
            while (iterator.hasNext()) {
                String imgUrl = iterator.next().toString();
                logger.info("checking imgUrl: " + imgUrl);
                try {
                    URL url = new URL(imgUrl);
                    HttpURLConnection huc = (HttpURLConnection) url.openConnection();
                    huc.setRequestMethod("HEAD");
                    int responseCode = huc.getResponseCode();
                    if (HttpURLConnection.HTTP_OK == responseCode) {
                        return imgUrl;
                    } else {
                        break;
                    }
                } catch (Exception exception) {
                    logger.info("url checking failed", exception);
                    return "https://jiaomao.solemountain.cn/upload/2022/06/jiaomao.png";
                }
            }
        }
        return "https://jiaomao.solemountain.cn/upload/2022/06/jiaomao.png";
    }
}
