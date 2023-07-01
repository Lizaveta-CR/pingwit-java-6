package com.pingwit.core.les_15.classwork.point_3;

public class FinallyAdvancedExample {

    public static void main(String[] args) {
//        System.out.println(message());
        System.out.println(returnExample());
    }

    private static String message() {
        try {
            Integer.valueOf("assaaa");
        } catch (NumberFormatException e) {
            System.exit(1);
            System.out.println("ksksksk");
        } finally {
            return "Block Finally value";
        }
    }

    private static String returnExample() {
        try {
            Integer.valueOf("ssss");
        } catch (NumberFormatException e) {
            System.out.println("ssss");
            return "Catch";
        } finally {
            return "finally value";
        }
    }
}
