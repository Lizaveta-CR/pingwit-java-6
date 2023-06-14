package com.pingwit.core.les_10.classwork.point_1;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println(power(5));
        System.out.println(powerIterative(5));
    }

    static int power(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * power(n - 1);
    }

    static int powerIterative(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= 2;
        }
        return res;
    }
}
