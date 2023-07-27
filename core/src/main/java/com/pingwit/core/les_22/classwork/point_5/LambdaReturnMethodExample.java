package com.pingwit.core.les_22.classwork.point_5;

import java.util.function.BinaryOperator;

enum Operator {

    SUM,
    DIVIDE
}

@FunctionalInterface
interface Operation {

    Integer process(Integer x, Integer y);
}

public class LambdaReturnMethodExample {

    public static void main(String[] args) {
        Operation operation = findOperationStrategy(Operator.SUM);
        Integer result = operation.process(5, 10);
        System.out.println(result);
        BinaryOperator<Integer> binaryOperator = findOperationStrategy2(Operator.SUM);
        Integer apply = binaryOperator.apply(5, 10);
    }

    private static Operation findOperationStrategy(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case DIVIDE -> (x, y) -> x / y;
            default -> (x, y) -> x + y;
        };
    }

    private static BinaryOperator<Integer> findOperationStrategy2(Operator operator) {
        return switch (operator) {
            case SUM -> (x, y) -> x + y;
            case DIVIDE -> (x, y) -> x / y;
            default -> (x, y) -> x + y;
        };
    }
}