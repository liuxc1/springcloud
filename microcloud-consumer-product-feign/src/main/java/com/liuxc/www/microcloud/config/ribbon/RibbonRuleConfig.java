package com.liuxc.www.microcloud.config.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author L
 * @date 2019/1/11 - 16:39
 */
//@Configuration
public class RibbonRuleConfig {
   // @Bean
    public IRule getRule() {
        //随机访问
        return new RandomRule();
    }
}
