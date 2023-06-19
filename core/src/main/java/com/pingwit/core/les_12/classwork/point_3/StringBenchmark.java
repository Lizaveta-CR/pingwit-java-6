package com.pingwit.core.les_12.classwork.point_3;

import java.util.Scanner;

public class StringBenchmark {

    public static void main(String[] args) {
        String str1 = "A";
        StringBuilder str2 = new StringBuilder("A");
        StringBuffer str3 = new StringBuffer("A");
        String strToAdd = "B";

        int times = 1_000_000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            str1 += strToAdd;
        }
        long str1Finish = System.currentTimeMillis();
        System.out.println("String: " + (str1Finish - start));

        long startStr2 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            str2.append(strToAdd);
        }
        long str2Finish = System.currentTimeMillis();
        System.out.println("String Builder: " + (str2Finish - startStr2));

        long startStr3 = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            str3.append(strToAdd);
        }
        long str3Finish = System.currentTimeMillis();
        System.out.println("String Buffer: " + (str3Finish - startStr3));
    }
}
