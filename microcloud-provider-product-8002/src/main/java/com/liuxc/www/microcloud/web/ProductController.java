package com.liuxc.www.microcloud.web;


import com.liuxc.www.microcloud.domain.Product;
import com.liuxc.www.microcloud.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Object getList(HttpServletRequest request) {
        System.out.println("8002==>" + request.getSession().getId());
        List<Product> list = productService.getList();
        list.get(0).setVersion(8002);
        return list;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Object get(@PathVariable long id) {

        return productService.get(id);
    }

}
