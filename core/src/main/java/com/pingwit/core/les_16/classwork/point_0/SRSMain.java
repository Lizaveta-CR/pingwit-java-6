package com.pingwit.core.les_16.classwork.point_0;

public class SRSMain {

    public static void main(String[] args) {

    }

    public boolean isPrime(int num) {
        boolean isPrime = true;
        if (num < 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        return isPrime;
    }
}
