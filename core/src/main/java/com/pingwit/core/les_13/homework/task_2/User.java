package com.pingwit.core.les_13.homework.task_2;

public class User {
    private String name;
    private int age;
    private Cart cart;

    public String getName() {
        return name;
    }

    public Cart getCart() {
        return cart;
    }

    public User(String name, int age, Cart cart) {
        this.name = name;
        this.age = age;
        this.cart = cart;
    }
}
