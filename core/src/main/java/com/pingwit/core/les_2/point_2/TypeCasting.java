package com.pingwit.core.les_2.point_2;

public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = 120;
        short myShort = myByte;
        System.out.println(myShort);

        byte myByte2 = 120;
        byte myByte3 = 50;
        float sumOfBytes = myByte2 + myByte3;
        System.out.println(sumOfBytes);

        myByte = (byte) myShort;
        System.out.println(myByte);

        //200 - 256 = -56
        myShort = 400;
        myByte = (byte) myShort;
        System.out.println(myByte);

        double myDouble = 33.99;
        int myInt = (int) myDouble;
        System.out.println("myInt = " + myInt);

        char c = 'K';
        System.out.println(c);
        int x = c;
        System.out.println(x);
        double d = c;

        String myString = "Hello, someone!";
        Byte carSpeed = 100;//autoboxing
        //byte byteVal = carSpeed.byteValue(); - unboxing
        String carSpeedStr = carSpeed.toString();
        System.out.println(carSpeedStr);
        byte byteVal = carSpeed.byteValue();

        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
    }
}
