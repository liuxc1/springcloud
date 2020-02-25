package com.liuxc.www.microcloud.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author L
 * @date 2019/1/14 - 22:19
 */
@RestController
@RequestMapping("configClient")
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName; // 应用名称

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers; // eurka服务注册路径

    @RequestMapping("/getConfig")
    public String getConfig() {

        return "【服务名称：" + applicationName + "、服务注册地址：" + eurekaServers + "】";
    }

}
