package com.smt.scraper;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.swagger.api.PostControllerApi;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

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
}
