package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author L
 * @date 2019/1/8 - 14:54
 */
@SpringBootApplication
@EnableEurekaServer //开启注册中心服务
public class Eureka_7001_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Eureka_7001_StartSpringCloudApplication.class);
    }
}
