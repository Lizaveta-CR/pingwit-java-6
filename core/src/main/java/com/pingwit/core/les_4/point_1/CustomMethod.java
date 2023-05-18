package com.pingwit.core.les_4.point_1;

import java.util.Scanner;

public class CustomMethod {

    public static void main(String[] args) {
        int max = getMaxNumber();
        findSum(max);
    }

    static void findSum(int maxNum) {
        int i = 0;
        int sum = 0;
        while (i <= maxNum) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    static int getMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter max number: ");
        int max = scanner.nextInt();
        return max;
    }
}
