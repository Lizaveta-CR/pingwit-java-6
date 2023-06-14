package com.pingwit.core.les_10.classwork.point_1;

public class RussianDoll {

    public static void main(String[] args) {
        openDoll(5);
    }

    public static void openDoll(int doll) {
        if (doll == 1) {
            System.out.println("All dolls are opened");
        } else {
            openDoll(doll - 1);
        }
    }
}
