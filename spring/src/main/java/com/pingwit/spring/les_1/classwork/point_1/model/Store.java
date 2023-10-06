package com.pingwit.spring.les_1.classwork.point_1.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Store {

    @Autowired
//    @Qualifier("product1")
    private Product product;

    public Store() {
    }

    public Store(Product product) {
        this.product = product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
