package com.pingwit.core.les_5.point_5;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arrayToSort = {9, 1, 3, 195, 23, 4};
        System.out.println(Arrays.toString(arrayToSort));
        sort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        Arrays.sort(arrayToSort);
    }

    static void sort(int[] arrayToSort) {
        boolean needToSort = true;
        while (needToSort) {
            needToSort = false;

            for (int i = 1; i < arrayToSort.length; i++) {
                if (arrayToSort[i] < arrayToSort[i - 1]) {
                    swap(arrayToSort, i, i - 1);
                    needToSort = true;
                }
            }
        }
    }

    static void swap(int[] arrayToSort, int current, int previous) {
        int temp = arrayToSort[previous];
        arrayToSort[previous] = arrayToSort[current];
        arrayToSort[current] = temp;
    }
}
