package com.pingwit.core.les_18.classwork.point_1;

public class AccountMain {

    public static void main(String[] args) {
        Account<String, Double> accStr = new Account<>("1223343", 123.0, "USA");
        Account<Integer, Integer> accInt = new Account<>(1234, 123, 123);
        Account<InternalId, Integer> accInternal = new Account<>(new InternalId(), 123, "USA");
    }
}
