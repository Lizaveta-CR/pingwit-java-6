package com.pingwit.core.les_8.classwork.point_4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ImmutableData data = new ImmutableData(123, new String[] {"Lalal", "Smth"});
        String[] secretQuestions = data.getSecretQuestions();
        secretQuestions[1] = "Svoe";
        System.out.println(Arrays.toString(secretQuestions));
        System.out.println(data);
    }
}
