package com.liuxc.www.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author L
 * 启动类
 */
@SpringBootApplication
@EnableEurekaClient //开启注册中心客户端
@EnableZuulProxy
public class Zuul_9501_StartSpringCloudApplication {

    public static void main(String[] args) {

        SpringApplication.run(Zuul_9501_StartSpringCloudApplication.class);
    }
}
