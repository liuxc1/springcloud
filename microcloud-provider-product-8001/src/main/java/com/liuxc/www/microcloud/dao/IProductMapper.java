package com.liuxc.www.microcloud.dao;

import com.liuxc.www.microcloud.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author L
 * @date 2018/12/27 - 14:41
 */
@Mapper
public interface IProductMapper {

    List<Product> getList();

    Product get(long id);
}
