package com.pingwit.core.les_3.point_1;

public class LogicalOperators {

    public static void main(String[] args) {
        //& - AND, && - AND, | - OR, || - OR - хотя бы 1 true, ! - NOT
        boolean a = true;
        boolean b = false;
        boolean c = !(a && b);
        System.out.println(c);

        System.out.println(true || false);
        System.out.println(!(2 < 5));
        System.out.println(false & (2 > 5));
        System.out.println((2 < 5) || false);
        System.out.println((2 > 5) || true);
    }
}
