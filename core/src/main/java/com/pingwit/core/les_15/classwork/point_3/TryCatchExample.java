package com.pingwit.core.les_15.classwork.point_3;

import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {
        tryCatchNumberFormatException();
    }

    private static void tryCatchNumberFormatException() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        try {
            Integer number = Integer.valueOf(next);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format: " + next);
        } catch (IndexOutOfBoundsException e){
            System.out.println("sss");
        }
    }

    private static void tryCatchNumberFormatException2() {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        try {
            Integer number = Integer.valueOf(next);
            System.out.println(number);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Wrong number format: " + next);
        }
    }
}
