package com.pingwit.spring.les_1.classwork.point_1.config;

import org.springframework.stereotype.Service;

@Service
public class AnnotationConfigServiceExample {

    private InjectionBeanService injectionBeanService;

    public AnnotationConfigServiceExample(InjectionBeanService injectionBeanService) {
        this.injectionBeanService = injectionBeanService;
    }

    public AnnotationConfigServiceExample() {
        System.out.println("Constructor");
    }
}
