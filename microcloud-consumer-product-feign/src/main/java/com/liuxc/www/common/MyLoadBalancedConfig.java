package com.liuxc.www.common;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

public class MyLoadBalancedConfig {
	@Bean
	public IRule ribbonRule(){
		
		return new com.netflix.loadbalancer.RandomRule();//随机访问
	}
}
