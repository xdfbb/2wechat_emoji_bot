/*
 * chenhx
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package wiki.primo.reptile.juejin;

import com.alibaba.fastjson.JSON;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;
import wiki.primo.reptile.util.ChromeOptionsUtils;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author chenhx
 * @version 0.0.1
 * @className JueJinContent.java
 * @date 2021-07-22 8:11 下午
 * @description
 */
public class JueJinContent {

    /**
     * 获取文章数据
     * @param args
     */
    public static void main(String[] args) {
        String url = "https://juejin.cn/post/6987626608160931854";

        System.getProperties().setProperty("webdriver.chrome.driver", "/Users/chenhx/Desktop/config/chromedriver");
        System.getProperties().setProperty("selenuim_config", "/Users/chenhx/Desktop/config/config.ini");

        ChromeOptions chromeOptions = ChromeOptionsUtils.getChrome();
        ChromeDriver webDriver = new ChromeDriver(chromeOptions);

        webDriver.get(url);
        //  设置隐性等待时间 - 需要配合使用的
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        try {
            //等待一定时间再进行加载
            WebDriverWait wait = new WebDriverWait(webDriver, 20);
            //等待元素的加载。最大的时间30秒
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(JueJinBlog.CONTENT)));
        } catch (org.openqa.selenium.TimeoutException e) {
            //实际项目中，请打印日志。务必不要使用：e.printStackTrace()
            e.printStackTrace();
        }
        String pageSource = webDriver.getPageSource();

        JXDocument jxDocument = JXDocument.create(pageSource);
        String title = jxDocument.selNOne(JueJinBlog.TITLE).asString();
        String author = jxDocument.selNOne(JueJinBlog.AUTHOR).asString();
        String content = jxDocument.selNOne(JueJinBlog.CONTENT).asString();
        List<String> tags = jxDocument.selN(JueJinBlog.TAG).stream().map(JXNode::asString).collect(Collectors.toList());
        System.out.println("==title===" + title);
        System.out.println("==author===" + author);
        System.out.println("==tags==="+ JSON.toJSONString(tags));
        System.out.println("==content==="+ content);
    }

}
