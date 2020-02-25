package com.liuxc.www.microcloud.config.restful;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

/**
 * @author L
 * @date 2018/12/27 - 15:04
 */
@Configuration
public class RestfulTemplatesConfig {

    @Bean
    public HttpHeaders getHeader() {// 进行 http头信息配置
        HttpHeaders header = new HttpHeaders();// 定义一个认证头信息
        String auth = "liuxc:liuxc"; // 认证原始信息
        byte[] encode = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));// 进行加密处理
        String authHeader = "Basic " + new String(encode);
        header.set("Authorization", authHeader); // 加入头信息
        return header;
    }

    @Bean
    @LoadBalanced //加入负载均衡
    public RestTemplate getRestTemplate() {

        return new RestTemplate();
    }

    @Bean
    public IRule getRule(){

        return new RandomRule();
    }
}
