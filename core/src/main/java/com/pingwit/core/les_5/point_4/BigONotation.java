package com.pingwit.core.les_5.point_4;

public class BigONotation {

    public static void main(String[] args) {
        //O(1)
        int[] arr = {1, 2};
        System.out.println(arr.length);

        //O(n)
        long sum = findSum(arr);
    }

    static long findSum(int[] items) {
        long sum = 0;
        for (int item : items) {
            sum += item;
        }
        return sum;
    }
}
