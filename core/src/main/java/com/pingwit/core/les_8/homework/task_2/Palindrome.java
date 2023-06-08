package com.pingwit.core.les_8.homework.task_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Please enter string to check whether string is palindrome: ");
        Scanner sc = new Scanner(System.in);
        String givenStr = sc.next();
        System.out.println("Given string: " + givenStr);//stststs -> ['s', 't', 's', 't', 's', 't', 's']
        char[] givenStrChArr = givenStr.toCharArray();
        //check if string is palindrome
        boolean isPalindrome = isPalindrome(givenStrChArr);
        System.out.println("Is palindrome: " + isPalindrome);
    }

    private static boolean isPalindrome(char[] givenStrChArr) {
        boolean isPalindrome = true;
        int size = givenStrChArr.length;
        for (int i = 0; i < size / 2; i++) {
            if (givenStrChArr[i] != givenStrChArr[size - i - 1]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
