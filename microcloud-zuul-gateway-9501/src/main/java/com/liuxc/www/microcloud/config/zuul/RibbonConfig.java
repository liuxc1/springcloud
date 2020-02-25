package com.liuxc.www.microcloud.config.zuul;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author L
 * @date 2019/1/13 - 17:39
 */
//@Configuration
public class RibbonConfig {
   // @Bean
    public IRule getRule() {

        //随机访问
        return new RandomRule();
    }
}
