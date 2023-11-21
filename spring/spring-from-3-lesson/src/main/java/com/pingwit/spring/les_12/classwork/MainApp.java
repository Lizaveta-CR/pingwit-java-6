package com.pingwit.spring.les_12.classwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(PrototypeConfiguration.class);
        MyPrototypeBean bean1 = acac.getBean(MyPrototypeBean.class);
        MyPrototypeBean bean2 = acac.getBean(MyPrototypeBean.class);

        System.out.println(bean1 == bean2);
    }
}
