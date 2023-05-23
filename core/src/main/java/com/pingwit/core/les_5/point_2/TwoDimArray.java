package com.pingwit.core.les_5.point_2;

import java.util.Arrays;

public class TwoDimArray {

    public static void main(String[] args) {
        int[][] twoDimArr = new int[2][3];
        //{11, 22, 33}
        twoDimArr[0][0] = 11;
        twoDimArr[0][1] = 22;
        twoDimArr[0][2] = 33;
        //{4, 5, 6}
        twoDimArr[1][0] = 4;
        twoDimArr[1][1] = 5;
        twoDimArr[1][2] = 6;

        System.out.println(twoDimArr.length);
        System.out.println(twoDimArr[0].length);

        System.out.println(twoDimArr);

        for (int i = 0; i < twoDimArr.length; i++) {
            System.out.println(Arrays.toString(twoDimArr[i]));
        }
        System.out.println("====");
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++){
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
