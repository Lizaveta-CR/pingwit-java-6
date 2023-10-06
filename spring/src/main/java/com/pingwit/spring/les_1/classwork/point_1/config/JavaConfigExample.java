package com.pingwit.spring.les_1.classwork.point_1.config;

import com.pingwit.spring.les_1.classwork.point_1.model.Product;
import com.pingwit.spring.les_1.classwork.point_1.model.ProductImpl;
import com.pingwit.spring.les_1.classwork.point_1.model.Store;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigExample {

    @Bean
    public Product product() {
        return new ProductImpl();
    }

    @Bean
    public Store store() {
        Store store = new Store();
        store.setProduct(product());
        return store;
    }
}
