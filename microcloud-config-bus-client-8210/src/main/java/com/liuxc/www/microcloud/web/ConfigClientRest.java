package com.liuxc.www.microcloud.web;

import com.liuxc.www.microcloud.config.InfoConfig;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private InfoConfig config;

    @RequestMapping("/getConfig")
    public String getConfig() {

        return "【服务名称：" + this.config.getAppName() + "、公司名称：" + this.config.getCompanyName() + "、版本信息：" + this.config.getAppVersion() + "】";
    }

}
