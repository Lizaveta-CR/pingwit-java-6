package com.pingwit.spring.les_2.classwork.point_2.rest.application.model;

public class Animal {

    private Integer id;
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
