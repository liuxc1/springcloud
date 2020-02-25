package com.liuxc.www.microcloud.web;


import com.liuxc.www.microcloud.domain.Product;
import com.liuxc.www.microcloud.service.IProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author L
 * @Date 2018/12/20 - 17:23
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;


    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Object getList() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return productService.getList();
    }

    @HystrixCommand(
            commandProperties={
                //不启用超时
                @HystrixProperty(name = "execution.timeout.enabled", value = "true"),
                //设置超时时间默认是一秒
                @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
            },
            threadPoolProperties = {
                    //最大线程数量默认是10
                    @HystrixProperty(name="coreSize",value = "10")
            },
            fallbackMethod = "getFallback")
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable long id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return productService.get(id);
    }


    public Product getFallback(@PathVariable long id) {
        Product product = new Product();
        product.setId(id);
        product.setName("fallbackProductName");
        product.setNum(-1);
        product.setVersion(99999);

        return product;
    }
}
