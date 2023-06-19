package com.pingwit.core.les_12.classwork.point_2;

public class StringBuilderBufferExample {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello, Builder");
        StringBuffer sBuf = new StringBuffer("Hello, Buffer");

        stringBuilder.append(222);
        System.out.println(stringBuilder);
        stringBuilder.append(false);
        System.out.println(stringBuilder);
        stringBuilder.append(", hello");
        System.out.println(stringBuilder);

        String substring = stringBuilder.substring(2);
        System.out.println(substring);

        char c = stringBuilder.charAt(1);
        System.out.println(c);
        System.out.println(stringBuilder.length());
        int elInd = stringBuilder.indexOf("el");
        stringBuilder.insert(elInd, "!");
        System.out.println(stringBuilder);
    }
}
