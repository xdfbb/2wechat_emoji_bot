/*
 * chenhx
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package wiki.primo.reptile.infoq;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import io.swagger.api.AdminControllerApi;
import io.swagger.api.PostControllerApi;
import io.swagger.model.*;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import wiki.primo.reptile.util.ChromeOptionsUtils;

import javax.ws.rs.core.MediaType;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author chenhx
 * @version 0.0.1
 * @className InfoQList.java
 * @date 2021-07-22 8:11 下午
 * @description
 */
public class InfoQList {

    private static final Logger logger = LoggerFactory.getLogger(InfoQList.class);


    /**
     * 获取InfoQ文章列表数据
     *
     * @param args
     */
    public static void main(String[] args) {

        String url = "https://xie.infoq.cn/";

        System.getProperties().setProperty("webdriver.chrome.driver", "D:\\dev\\projects\\2wechat_emoji_bot\\chromedriver_win32\\chromedriver.exe");
        System.getProperties().setProperty("selenuim_config", "D:\\dev\\projects\\2wechat_emoji_bot\\chromedriver_win32");

        ChromeOptions chromeOptions = ChromeOptionsUtils.getChrome();
        //InfoQ有检测 user-agent，必须有这句
        chromeOptions.addArguments("user-agent=\"Mozilla/5.0 (iPod; U; CPU iPhone OS 2_1 like Mac OS X; ja-jp) AppleWebKit/525.18.1 (KHTML, like Gecko) Version/3.1.1 Mobile/5F137 Safari/525.20\"");
        ChromeDriver webDriver = new ChromeDriver(chromeOptions);

        try {
            webDriver.get(url);
            //  设置隐性等待时间 - 需要配合使用的
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


            JacksonJsonProvider provider = new JacksonJsonProvider();
            List providers = new ArrayList();
            providers.add(provider);

            AdminControllerApi adminControllerApi = JAXRSClientFactory.create("https://jiaomao.solemountain.cn/", AdminControllerApi.class, providers);
            WebClient.client(adminControllerApi).accept(MediaType.APPLICATION_JSON_TYPE);

            LoginParam loginParam = new LoginParam();
            loginParam.setUsername("xdfbb");
            loginParam.setPassword("11291212Ee");

            AuthWrapper authToken = adminControllerApi.authUsingPOST(loginParam);


            PostControllerApi postControllerApi = JAXRSClientFactory.create("https://jiaomao.solemountain.cn/", PostControllerApi.class, providers);
            WebClient.client(postControllerApi).header("ADMIN-Authorization",authToken.getAuthToken().getAccessToken());
            WebClient.client(adminControllerApi).accept(MediaType.APPLICATION_JSON_TYPE);

            extracted(webDriver, By.xpath(InfoQBlog.URLS.substring(0, InfoQBlog.URLS.lastIndexOf("/"))));
            String pageSource = webDriver.getPageSource();
            JXDocument jxDocument = JXDocument.create(pageSource);
            List<String> titles = jxDocument.selN(InfoQBlog.TITLES).stream().map(JXNode::asString).collect(Collectors.toList());
            List<String> blogUrls = jxDocument.selN(InfoQBlog.URLS).stream().map(JXNode::asString).collect(Collectors.toList());

            Iterator<String> titlesIT = titles.iterator();


            for (String blogurl : blogUrls) {
                logger.info("start retrieve from url " + blogurl);
                webDriver.get(blogurl);
                extracted(webDriver, By.xpath(InfoQBlog.CONTENT));
                pageSource = webDriver.getPageSource();
                jxDocument = JXDocument.create(pageSource);
                String blogContent = jxDocument.selNOne(InfoQBlog.CONTENT).asString();
                logger.info("received content   - " + blogContent);

                String contentTitle = titlesIT.next();
                PostParam post = new PostParam();
                post.setTitle(contentTitle);
                post.setContent(blogContent);
                post.setOriginalContent(blogContent);
                post.setStatus(PostParam.StatusEnum.PUBLISHED);
                post.setKeepRaw(true);
                List<Integer> categoryIds = new ArrayList<>();
                categoryIds.add(9);
                post.setCategoryIds(categoryIds);
                List<Integer> tagIds = new ArrayList<>();
                tagIds.add(2);
                post.setTagIds(tagIds);
                post.setSummary(contentTitle);
                PostDetailVO result = postControllerApi.createByUsingPOST7(post, true);
                if (result != null && "400".equalsIgnoreCase(result.getStatus())) {
                    logger.error("ERROR CREATING CONTENT WITH : " + contentTitle);
                }
            }
        } catch (Exception ex) {
            logger.error("SELENIUM　ERROR -- ", ex);
        } finally {
            webDriver.close();
            webDriver.quit();
        }
    }

    private static void extracted(ChromeDriver webDriver, By locator) {
        try {
            //等待一定时间再进行加载
            WebDriverWait wait = new WebDriverWait(webDriver, 20);
            //等待元素的加载。最大的时间30秒
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (org.openqa.selenium.TimeoutException exception) {
            logger.error("SELENIUM　ERROR -- ", exception);
        }
    }

}
