package com.xkcoding.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <p>
 * 启动器
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2018-12-29 10:28
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication(scanBasePackages = "com.xkcoding.async")
public class SpringBootDemoAsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAsyncApplication.class, args);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

