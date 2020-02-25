package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author L
 * 启动类
 */
@SpringBootApplication
@EnableEurekaClient //开启注册中心客户端
@EnableCircuitBreaker //开启服务端接口异常回调（服务熔断）
public class Provider_8004_StartSpringCloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(Provider_8004_StartSpringCloudApplication.class);
    }
}
