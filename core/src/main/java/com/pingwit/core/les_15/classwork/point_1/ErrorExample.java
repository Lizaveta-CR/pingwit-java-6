package com.pingwit.core.les_15.classwork.point_1;

public class ErrorExample {

    public static void main(String[] args) {
//        outOfMemoryError();
        stackOverflowError();
    }

    public static void stackOverflowError(){
        stackOverflowError();
    }
    public static void outOfMemoryError(){
        int[] array = new int[Integer.MAX_VALUE];
    }
}
