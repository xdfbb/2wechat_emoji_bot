package com.smt.wechatemojibot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@SpringBootApplication(scanBasePackages = "com.smt")
@EnableTransactionManagement
@EnableJpaRepositories("com.smt.persistence")
@EntityScan("com.smt.persistence")
@EnableScheduling
@PropertySource("file:${user.home}/batch_config/config.properties")
public class BotServiceRunner {
    public static void main(String[] args) {
        SpringApplication.run(BotServiceRunner.class, args);
    }
}
