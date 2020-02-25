package com.liuxc.www.microcloud.service.impl;


import com.liuxc.www.microcloud.dao.IProductMapper;
import com.liuxc.www.microcloud.domain.Product;
import com.liuxc.www.microcloud.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author L
 */
@Service
public class ProductServiceImpl implements IProductService {

    private final IProductMapper dao;

    @Autowired
    public ProductServiceImpl(IProductMapper dao) {
        this.dao = dao;
    }

    @Override
    public List<Product> getList() {

        return dao.getList();
    }

    @Override
    public Product get(long id) {

        return dao.get(id);
    }
}
