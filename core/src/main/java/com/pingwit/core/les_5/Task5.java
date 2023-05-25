package com.pingwit.core.les_5;

import java.util.Arrays;
import java.util.Scanner;

/*
Task 5
Есть массив чисел, нужно инвертировать его порядок, т.е. массив [0,1,2,3,4] -> [4,3,2,1,0]
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter array element: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Original array is: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array is: " + Arrays.toString(arr));
    }

    public static void reverse(int[] array) {
        int length = array.length;
        int temp;
        // [0,1,2,3,4,5]
        for (int i = 0; i < length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }
}
