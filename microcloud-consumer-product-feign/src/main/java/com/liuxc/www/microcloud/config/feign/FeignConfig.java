package com.liuxc.www.microcloud.config.feign;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author L
 * feign 接口服务调度配置
 */
@Configuration
public class FeignConfig {

    /**
     * feign 处理权限认证处理
     * 这里替换原来的 header
     */
    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {

        return new BasicAuthRequestInterceptor("zuul", "zuul");
       //return new BasicAuthRequestInterceptor("liuxc", "liuxc");
    }

    /**
     * 修改feign 日志等级
     */
    @Bean
    public Logger.Level getLogger(){

        return Logger.Level.FULL;
    }
}
