package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author L
 */
@SpringBootApplication
@EnableEurekaServer //开启注册中心服务
public class Eureka_7003_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Eureka_7003_StartSpringCloudApplication.class);
    }
}
