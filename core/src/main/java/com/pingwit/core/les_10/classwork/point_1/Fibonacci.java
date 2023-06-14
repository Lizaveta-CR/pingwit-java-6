package com.pingwit.core.les_10.classwork.point_1;

//1, 1, 2, 3, 5, 8, 13, ....
public class Fibonacci {

    public static void main(String[] args) {
        int max = 7;
        for (int i = 0; i < max; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }

    /*
         i = 0; 1
         i = 1; 1
         i = 2; 1 + 1 = 2;
         i = 3; 1 + 1 + 1 = 3;

     */
    public static int fibonacci(int number) {
        if (number < 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
