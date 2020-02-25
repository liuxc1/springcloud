package com.liuxc.www.microcloud.service;

import com.liuxc.www.microcloud.config.feign.FeignConfig;
import com.liuxc.www.microcloud.domain.Product;
import com.liuxc.www.microcloud.fallback.ProductServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author L
 * @date 2019/1/11 - 15:29
 */
/*
不使用代理地址
@FeignClient(name = "MICROCLOUD-PROVIDER-PRODUCT", configuration = FeignConfig.class,
             fallback = ProductServiceFallback.class
            )
            */
/*
 *使用eureka代理地址
 *  name 为 eureka 代理服务ID
 */
@FeignClient(name = "MICROCLOUD-ZUUL-GATEWAY", configuration = FeignConfig.class,
        fallback = ProductServiceFallback.class
)
public interface IProductService {
   // @RequestMapping(value = "/product/getList", method = RequestMethod.GET)
        //加入代理服务的地址
    @RequestMapping(value = "/product-proxy/product/getList", method = RequestMethod.GET)
    List<Product> getList();

    @RequestMapping(value = "/product-proxy/product/get/{id}", method = RequestMethod.GET)
    Product get(@PathVariable(value = "id") long id);

}
