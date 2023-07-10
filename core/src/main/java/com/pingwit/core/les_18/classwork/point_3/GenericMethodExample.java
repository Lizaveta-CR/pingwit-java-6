package com.pingwit.core.les_18.classwork.point_3;

public class GenericMethodExample {

    public static void main(String[] args) {
        Integer doubleInt = MathConverter.convert(33.0);
        Integer longInt = MathConverter.convert(33L);
//        Integer longInt = MathConverter.convert("33L");
    }
}

class MathConverter {
    public static <T extends Number> Integer convert(T fromValue) {
        return fromValue.intValue();
    }
}
