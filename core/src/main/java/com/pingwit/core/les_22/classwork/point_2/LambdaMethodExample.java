package com.pingwit.core.les_22.classwork.point_2;

@FunctionalInterface
interface LambdaMethod {

    Integer increment(Integer integer);
}

public class LambdaMethodExample {

    public static void main(String[] args) {
        LambdaMethod incrementByOne = x -> ++x;
        LambdaMethod incrementMultTwo = x -> x *= 2;

        System.out.println(incrementByOne.increment(1));
        System.out.println(incrementMultTwo.increment(2));

        Integer process1 = process(incrementByOne, 2);
        System.out.println(process1);
        Integer process2 = process(incrementMultTwo, 4);
        System.out.println(process2);

        Integer process3 = process(x -> x *= 3, 4);

    }

    public static Integer process(LambdaMethod lambdaMethod, Integer input) {
        return lambdaMethod.increment(input);
    }
}
