package com.liuxc.www.microcloud.fallback;

import com.liuxc.www.microcloud.domain.Product;
import com.liuxc.www.microcloud.service.IProductService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author L
 */
@Component
public class ProductServiceFallback implements IProductService {


    @Override
    public List<Product> getList() {

        return new ArrayList<>();
    }

    @Override
    public Product get(long id) {

        return new Product();
    }
}
