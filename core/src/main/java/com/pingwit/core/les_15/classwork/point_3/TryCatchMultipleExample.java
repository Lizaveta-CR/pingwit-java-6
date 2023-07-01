package com.pingwit.core.les_15.classwork.point_3;

import java.util.Scanner;

public class TryCatchMultipleExample {

    public static void main(String[] args) {

    }

    private static void tryCatchNumberFormatException() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        try {
            Integer number = Integer.valueOf(next);
            System.out.println(number);
        } catch (Exception e) {
            System.out.println("Wrong number format: " + next);
        }
    }
}
