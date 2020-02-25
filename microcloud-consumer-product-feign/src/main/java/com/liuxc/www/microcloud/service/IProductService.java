package com.liuxc.www.microcloud.service;

import com.liuxc.www.microcloud.config.feign.FeignConfig;
import com.liuxc.www.microcloud.domain.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author L
 * @date 2019/1/11 - 15:29
 */
@FeignClient(value = "MICROCLOUD-ZUUL-GATEWAY", configuration = FeignConfig.class)
public interface IProductService {
     //@RequestMapping(value = "/product/getList", method = RequestMethod.GET)
    //加入代理服务的地址
    @RequestMapping(value = "/product-proxy/product/getList", method = RequestMethod.GET)
    List<Product> getList();

    @RequestMapping(value = "/product-proxy/product/get/{id}", method = RequestMethod.GET)
    //@RequestMapping(value = "/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable(value = "id") long id);

}
