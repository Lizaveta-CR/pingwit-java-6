package com.pingwit.core.les_22.classwork.point_3;

@FunctionalInterface
interface FilterExample {

    boolean filter(Integer x);
}

public class MethodReferenceExample {

    public static void main(String[] args) {
        Filter filter = new Filter();
        FilterExample filterExample = filter::filterKakUgodno;
        FilterExample filterExample2 = Filter::filterKakStatic;
        System.out.println(filterExample.filter(1));
    }
}

class Filter {

    public static final int MAX_VALUE = 20;

    static boolean filterKakStatic(Integer x) {
        return x > MAX_VALUE;
    }

    boolean filterKakUgodno(Integer x) {
        return x > MAX_VALUE;
    }
}