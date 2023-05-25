package com.pingwit.core.les_5;

import java.util.Scanner;

public class RoadExample {
    public static void main(String[] args) {
        Scanner road = new Scanner(System.in);
        System.out.println("Enter travel time in seconds, please");
        int expectedWorkingTime = road.nextInt() * 1000;

        String emptySymbol = " ";
        int maxWidth = 10;
        boolean reverse = false;

        int currentWidth = maxWidth;
        String printingRoad = "||  |  ||";

        long finishTime = System.currentTimeMillis() + expectedWorkingTime;

        while (System.currentTimeMillis() < finishTime) {
            for (int leftPadding = 0; leftPadding < currentWidth; leftPadding++) {
                System.out.print(emptySymbol);
            }

            if (currentWidth == 0) {
                reverse = false;
            }

            if (currentWidth == maxWidth) {
                reverse = true;
            }

            if (reverse) {
                currentWidth--;
            } else {
                currentWidth++;
            }

            System.out.println(printingRoad);
        }
    }
}
