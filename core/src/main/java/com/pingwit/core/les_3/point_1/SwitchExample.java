package com.pingwit.core.les_3.point_1;

public class SwitchExample {

    public static void main(String[] args) {
        /*
            switch(expression) {
                case x: //code;
                case y: //code;
                ...
                default: //code;
            }
         */

        int x = 30;
        switch (x) {
            case 27:
                System.out.println("case 1");
                break;
            case 30:
                System.out.println("case 2");
                break;
            case 31:
                System.out.println("case 3");
                break;
            default:
                System.out.println("default");
        }

        System.out.println(" === ");
        switch (x) {
            case 27 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 33 -> System.out.println("3");
            case 11 -> System.out.println("4");
            case 444 -> System.out.println("5");
            default -> System.out.println("default");
        }

    }

}
