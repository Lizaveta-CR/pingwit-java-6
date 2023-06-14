package com.pingwit.core.les_10.classwork.point_1;

//4! = 1*2*3*4, 2!=1*2, 3!=1*2*3. 0! = 1
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorialCycle(10));
    }

    public static long factorial(int number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public static long factorialCycle(int number) {
        long result = 1;

        for (int i = 2; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
