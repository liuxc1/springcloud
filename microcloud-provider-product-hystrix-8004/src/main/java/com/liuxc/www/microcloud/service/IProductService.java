package com.liuxc.www.microcloud.service;


import com.liuxc.www.microcloud.domain.Product;

import java.util.List;

/**
 * @author L
 */
public interface IProductService {

    List<Product> getList();

    Product get(long id);
}
