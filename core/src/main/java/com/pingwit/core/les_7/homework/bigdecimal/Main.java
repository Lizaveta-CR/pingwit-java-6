package com.pingwit.core.les_7.homework.bigdecimal;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double a = 0.02;
        double b = 0.03;
        double c = b - a;
        System.out.println(c);

        BigDecimal bigA = new BigDecimal("0.02");
        BigDecimal bigB = new BigDecimal("0.03");
        BigDecimal bigC = bigB.subtract(bigA);
        System.out.println(bigC);
    }
}
