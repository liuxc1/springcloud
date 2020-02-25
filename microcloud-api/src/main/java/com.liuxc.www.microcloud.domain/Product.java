package com.liuxc.www.microcloud.domain;

import java.io.Serializable;

/**
 * @author L
 * @date 2018/12/27 - 13:59
 */
public class Product implements Serializable {
    /**
     * 商品ID
     */
    private long id;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品数量
     */
    private long num;
    /**
     * 商品版本
     */
    private long version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
