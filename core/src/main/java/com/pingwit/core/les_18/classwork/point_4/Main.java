package com.pingwit.core.les_18.classwork.point_4;

import com.pingwit.core.les_18.classwork.point_1.Box;

public class Main {

    public static void main(String[] args) {
        Object someObj = new Object();
        Integer someInteger = 10;
        Integer someInteger2 = 10;
        Integer sum = someInteger + someInteger2;
        someObj = someInteger;
        someMethod(11);
        someMethod(10.1);

        Box<Number> boxNum = new Box<>();//Box<Number> extend Object
        Box<Integer> boxInteger = new Box<>();//Box<Integer> extend Object
        someMethod2(boxNum);
//        someMethod2(boxInteger);
//        Box<int> //only with big letter! Only ссылочные
    }

    public static void someMethod(Number n) {
        //code
    }

    public static void someMethod2(Box<Number> n) {
        //code
    }
}
