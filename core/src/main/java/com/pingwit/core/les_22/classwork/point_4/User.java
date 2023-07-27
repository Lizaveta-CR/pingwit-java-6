package com.pingwit.core.les_22.classwork.point_4;

public record User(String name, Integer age) {
    public User() {
        this("Default", 22);
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
