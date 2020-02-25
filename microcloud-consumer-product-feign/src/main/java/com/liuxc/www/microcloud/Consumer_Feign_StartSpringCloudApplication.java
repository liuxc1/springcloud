package com.liuxc.www.microcloud;

import com.liuxc.www.common.MyLoadBalancedConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


/**
 * @author L
 * @date 2018/12/27 - 14:59
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name="ribbonClient",configuration= MyLoadBalancedConfig.class)
public class Consumer_Feign_StartSpringCloudApplication {
    public static void main(String[] args) {

        SpringApplication.run(Consumer_Feign_StartSpringCloudApplication.class, args);
    }
}



