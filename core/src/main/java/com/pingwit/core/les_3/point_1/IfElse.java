package com.pingwit.core.les_3.point_1;

public class IfElse {

    public static void main(String[] args) {
        /*
        if(condition) {
            //block of code to be executed if condition = true
        } else {
            //logic if condition = false
        }
         */

        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("Hello!");
        } else {
            System.out.println("else...");
        }

        if (x < 8) {
            System.out.println("x < 8");
        } else if (x < 11) {
            System.out.println("x < 11");
        } else {
            System.out.println("default ... ");
        }

        if (x < 11) {
            System.out.println("aaaa");
        }

        int number = 20;
        boolean isEven = number % 2 == 0;
        // =, ==

        if (isEven) {
            System.out.println("Number is even");
        } else {
            System.out.println("Not even");
        }

        String result = number % 2 == 0 ? "Even" : "Not Even";
        System.out.println(result);
    }
}
