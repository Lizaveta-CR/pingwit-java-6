package com.pingwit.core.les_22.classwork.point_4;

@FunctionalInterface
public interface FuctUser {

    User supply(String name, Integer age);
}

class FuncConstructorExample {
    public static void main(String[] args) {

        FuctUser funcUser = User::new;

        User egor = funcUser.supply("Egor", 55);
        System.out.println(egor);
    }
}
