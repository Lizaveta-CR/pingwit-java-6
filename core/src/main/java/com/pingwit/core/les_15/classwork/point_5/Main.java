package com.pingwit.core.les_15.classwork.point_5;

public class Main {

    public static void main(String[] args) throws MyCustomCheckedException {
//        ex1();
//        ex2();
        ex3();
    }

    static void ex1() {
        throw new MyCustomUncheckedException("My unchecked exception");
    }

    static void ex2() {
        try {
            throw new MyCustomCheckedException();
        } catch (MyCustomCheckedException e) {
            System.out.println("MyCustomCheckedException");
        }
    }

                                                static void ex3() throws MyCustomCheckedException{
                                                    throw new MyCustomCheckedException();
    }
}
