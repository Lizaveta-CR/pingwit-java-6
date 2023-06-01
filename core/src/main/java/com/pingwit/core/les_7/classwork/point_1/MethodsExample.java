package com.pingwit.core.les_7.classwork.point_1;

import com.pingwit.core.les_7.classwork.point_2.Car;

public class MethodsExample {

    public static void main(String[] args) {
        int sum = sum(1, 2);
        System.out.println(sum);
        MethodsExample me = new MethodsExample();
        int res = me.sum2(3, 4);
        int[] arr = {1, 3, 5};
        me.sum3(arr);
        me.sum3(1, 2, 3, 4, 56, 7);
        me.sum2(arr);
        System.out.println(res);
        Operations.sum(2, 3);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    int sum2(int a, int b) {
        return a + b;
    }

    double sum2(double a, double b) {
        return a + b;
    }

    int sum2(int[] nums) {
        int sum = 0;
        for (int index : nums) {
            sum += index;
        }
        return sum;
    }

    int sum3(int... nums) {
        int sum = 0;
        for (int index : nums) {
            sum += index;
        }
        return sum;
    }
}
