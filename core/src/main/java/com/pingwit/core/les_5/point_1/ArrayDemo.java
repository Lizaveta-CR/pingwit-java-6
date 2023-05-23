package com.pingwit.core.les_5.point_1;

public class ArrayDemo {

    public static void main(String[] args) {
        //type[] anArray, type array[]
        byte length = 10;
        int[] array = new int[length];
        System.out.println(array);
        array[0] = 100;
        array[1] = 200;
        array[2] = 220;
        array[3] = 300;
        array[4] = 400;
        array[5] = 500;
        array[6] = 600;
        array[7] = 700;
        array[8] = 100;
        array[9] = 1000;

        System.out.println(array.length);

        System.out.println("====");
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) * 100;
            System.out.println(array[i]);
        }

        int[] anArray = {100, 200, 300, 400};
        System.out.println(anArray.length);
        System.out.println(anArray[0]);
        System.out.println(anArray[anArray.length - 1]);
    }
}
