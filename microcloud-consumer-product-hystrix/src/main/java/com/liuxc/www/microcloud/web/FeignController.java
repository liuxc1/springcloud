package com.liuxc.www.microcloud.web;

import com.liuxc.www.microcloud.domain.Product;
import com.liuxc.www.microcloud.service.IProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author L
 * @date 2019/1/11 - 15:35
 */
@RestController
@RequestMapping(value = "/feign")
public class FeignController {

    @Autowired
    private IProductService productService;


    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Object getList() {

        return productService.getList();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product add(@PathVariable(value = "id") long id) {

        return productService.get(id);
    }
}
