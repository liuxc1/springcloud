package com.liuxc.www.microcloud.config.feign;

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
        //因为使用了代理访问，所以这里的权限认证也应该使用代理的用户名和密码
        // return new BasicAuthRequestInterceptor("liuxc", "liuxc");
        return new BasicAuthRequestInterceptor("zuul", "zuul");
    }

    /**
     * 修改feign 日志等级
     */
    @Bean
    public Logger.Level getLogger() {

        return Logger.Level.FULL;
    }
}
