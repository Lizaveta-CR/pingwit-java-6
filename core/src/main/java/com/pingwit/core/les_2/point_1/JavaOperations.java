package com.pingwit.core.les_2.point_1;

public class JavaOperations {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;

        int sum = num1 + num2;
        int sub = num1 - num2;
        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);

        int num3 = 33;
        int div = num1 / num3;
        System.out.println("Division = " + div);
        float divFloat = num1 / num3;
        System.out.println("DIvision = " + divFloat);

        float fl1 = 12.2f;
        float fl2 = 11.1f;
        System.out.println(fl1 / fl2);

        int myInt = 100;
        myInt += 10;
        System.out.println("myInt = " + myInt);
        System.out.println("myInt++ = " + myInt++);//myInt = myInt + 1
        System.out.println("++myInt = " + ++myInt);//myInt = myInt + 1, 111+1

        System.out.println("0 / 0 = " + 0f / 0);
        System.out.println("12.0 / 0 = " + 12.0 / 0);
        System.out.println("-12.0 / 0 = " + -12.0 / 0);
        System.out.println("0 / 0f = " + 0 / 0f);

        boolean myBool = 2 > 4;
        System.out.println("myBool = " + myBool);
        boolean myBool2 = 4 <= 4;
        System.out.println("myBool2 = " + myBool2);

        /*
            3 -> 1 1
            3 << 2 -> 1 1 0 0 -> 12

            8 -> 1 0 0 0
            8 >> 2 -> 1 0 -> 2
         */
        int myInt22 = 3 << 2;
        System.out.println(myInt22);

        int myInt23 = 8 >> 2;
        System.out.println(myInt23);
    }
}
