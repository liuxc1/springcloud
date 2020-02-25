package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author L
 */
@SpringBootApplication
@EnableEurekaClient
public class Config_8210_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Config_8210_StartSpringCloudApplication.class, args);
    }
}



