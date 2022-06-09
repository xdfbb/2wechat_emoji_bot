package com.smt.wechatemojibot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.DefaultBotOptions;

import javax.annotation.PostConstruct;

@Component
public class BotOptions extends DefaultBotOptions {
    @Value("${enable.http.proxy}")
    private boolean enableProxy;
    @Value("${http.proxy.host}")
    private String host;
    @Value("${http.proxy.port}")
    private int port;

    @PostConstruct
    private void checkProxy() {
        if (enableProxy) {
            setProxyType(ProxyType.HTTP);
            setProxyHost(host);
            setProxyPort(port);
        }
    }
}
