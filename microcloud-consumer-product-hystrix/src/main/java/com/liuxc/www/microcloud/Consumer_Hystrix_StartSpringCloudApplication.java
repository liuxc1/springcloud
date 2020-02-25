package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author L
 * @date 2018/12/27 - 14:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients //feign接口调用
public class Consumer_Hystrix_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Consumer_Hystrix_StartSpringCloudApplication.class, args);
    }
}



