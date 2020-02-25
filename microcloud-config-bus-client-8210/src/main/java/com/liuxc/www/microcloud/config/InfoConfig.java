package com.liuxc.www.microcloud.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author L
 * @date 2019/1/15 - 14:35
 */
@Component
@RefreshScope //如果没有该注解，则通过springCloudConfigBus 无法实现配置刷新服务
public class InfoConfig {
    //将所有需要动态的配置写在一个类之中
    @Value("${info.app.name}")
    private String appName;

    @Value("${info.company.name}")
    private String companyName;

    @Value("${info.app.version}")
    private String appVersion;

    public String getAppName() {
        return appName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAppVersion() {
        return appVersion;
    }
}
