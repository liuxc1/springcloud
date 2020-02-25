package com.liuxc.www.microcloud.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

/**
 * @author L
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 配置security 认证用户
     */
    @Autowired
    public void configGlobal(AuthenticationManagerBuilder builder) throws Exception {
        builder.inMemoryAuthentication().withUser("liuxc").password("liuxc").roles("USER","ACTUATOR")
                .and().withUser("admin").password("admin").roles("USER", "ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 所有的请求都需要通过认证后才可以正常进行
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated().and().csrf().disable();
        // 所有rest的服务都需要设置session无状态模式提高效率
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}
