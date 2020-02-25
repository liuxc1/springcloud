package com.liuxc.www.microcloud.config.zuul;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author L
 * @date 2019/1/13 - 17:12
 */
@Configuration
public class ZuulConfig {

    @Bean
    public AuthorizationRequestFilter getAuthorizationRequestFilter() {

        return new AuthorizationRequestFilter();
    }

}
