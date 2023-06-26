package com.pingwit.core.les_13.homework.task_1;

public class Calculator {

    public double calculate(double num1, double num2, Operation operation) {
        return operation.operate(num1, num2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.calculate(1, 2, new Addition());
        System.out.println(result);
    }
}

