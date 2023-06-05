package com.pingwit.core.les_8.classwork.point_4;

import java.util.Arrays;

public class ImmutableData {

    private int pin;
    private String[] secretQuestions;

    public ImmutableData(int pin, String[] secretQuestions) {
        this.pin = pin;
        this.secretQuestions = secretQuestions;
    }

    public String[] getSecretQuestions() {
        return secretQuestions.clone();
    }

    public int getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "ImmutableDate{" +
            "pin=" + pin +
            ", secretQuestions=" + Arrays.toString(secretQuestions) +
            '}';
    }
}
