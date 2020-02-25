package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author L
 * @date 2018/12/27 - 14:59
 */
@SpringBootApplication
@EnableEurekaClient
public class Consumer_80_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Consumer_80_StartSpringCloudApplication.class, args);
    }
}



