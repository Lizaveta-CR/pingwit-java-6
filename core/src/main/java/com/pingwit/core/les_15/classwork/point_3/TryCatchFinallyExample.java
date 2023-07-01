package com.pingwit.core.les_15.classwork.point_3;

import java.util.Scanner;

public class TryCatchFinallyExample {

    public static void main(String[] args) {
        example1();
    }

    private static void example1() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        try {
            Integer number = Integer.valueOf(next);
            System.out.println(number);
        } finally {
            System.out.println("Block finally");
        }
    }
}
