package com.liuxc.www.microcloud.web;

import com.liuxc.www.microcloud.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.spi.http.HttpHandler;
import java.util.List;

/**
 * @author L
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;
    //没有加入eureka 时的原始调用
    //private static final String RESTFUL_BASE_IP = "http://localhost:8001";

    //加入eureka 的调用服务方式，将不再关心具体的服务器的地址和端口。
    private static final String RESTFUL_BASE_IP = "http://MICROCLOUD-PROVIDER-PRODUCT";

    @ResponseBody
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Object getList() {
        List list = this.restTemplate.exchange(RESTFUL_BASE_IP + "/product/getList", HttpMethod.GET, new HttpEntity<>(httpHeaders), List.class).getBody();

        return list;
    }


    @ResponseBody
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Product add(@PathVariable(value = "id") long id) {

        return this.restTemplate.exchange(RESTFUL_BASE_IP + "/product/get/" + id, HttpMethod.GET, new HttpEntity<>(httpHeaders), Product.class).getBody();
    }

}
