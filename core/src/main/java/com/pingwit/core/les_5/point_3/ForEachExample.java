package com.pingwit.core.les_5.point_3;

import java.util.Arrays;

public class ForEachExample {

    public static void main(String[] args) {
        int[] initArr = {5, 2, 22, 11};
        for (int i = 0; i < initArr.length; i++) {
            System.out.println(initArr[i]);
        }
        System.out.println("====");
        for (int index : initArr) {
            System.out.println(index);
        }

        String[] cars = {"Mazda", "BNW", "Ford"};
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(Arrays.toString(initArr));
        System.out.println(Arrays.toString(cars));
    }
}
