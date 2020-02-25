package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author L
 * @date 2018/12/27 - 14:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Config_7201_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Config_7201_StartSpringCloudApplication.class, args);
    }
}



