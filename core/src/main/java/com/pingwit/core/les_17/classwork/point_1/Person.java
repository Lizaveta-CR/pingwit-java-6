package com.pingwit.core.les_17.classwork.point_1;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 8297633450538684649L;
    private String name;
    private String surname;
    private int age;
    private transient Work work;

    public Person(String name, String surname, int age, Work work) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", work=" + work +
            '}';
    }
}
