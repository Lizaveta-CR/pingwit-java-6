package com.pingwit.core.les_4.point_1;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("How old r u?");
        byte age = scanner.nextByte();

        System.out.println("Your name is = " + name);
        System.out.println("Your age is = " + age);
    }
}
