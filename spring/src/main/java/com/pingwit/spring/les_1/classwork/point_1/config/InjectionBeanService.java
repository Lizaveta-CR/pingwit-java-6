package com.pingwit.spring.les_1.classwork.point_1.config;

import com.pingwit.spring.les_1.classwork.point_1.model.Product;
import org.springframework.stereotype.Component;

@Component
public class InjectionBeanService {

    public InjectionBeanService(Product product) {
    }
}
