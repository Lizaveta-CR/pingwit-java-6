package com.pingwit.core.les_15.classwork.point_2;

public class RuntimeExample {

    public static void main(String[] args) {
//        arithmeticException();
//        npe();
//        classCastException();
//        numberFormatException();
//        aiofbe();
//        siofbe();
        arrayStoreException();
    }

    public static void arithmeticException() {
        int a = 10;
        int b = 0;
        int c = a / b;
    }

    public static void npe() {
        String s = null;
        s.toLowerCase();
    }

    public static void classCastException() {
        Object o = new Object();
        String o1 = (String) o;
    }

    public static void numberFormatException(){
        String s = "asd";
        double i = Double.parseDouble(s);
        System.out.println(i);
    }

    public static void aiofbe(){
        int[] array = new int[10];
        int i = array[10];
    }

    public static void siofbe(){
        String s = "123";
        char c = s.charAt(3);
    }

    public static void arrayStoreException(){
        Object[] array = new String[10];
        array[0] = new Object();
    }
}
