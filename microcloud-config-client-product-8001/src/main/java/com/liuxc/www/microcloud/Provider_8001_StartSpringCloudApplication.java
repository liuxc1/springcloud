package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author L
 * 启动类
 */
@SpringBootApplication
//@EnableEurekaClient //开启注册中心客户端
@EnableDiscoveryClient
public class Provider_8001_StartSpringCloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(Provider_8001_StartSpringCloudApplication.class);
    }
}
