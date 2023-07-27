package com.pingwit.core.les_22.classwork.point_6;

import java.util.function.Function;

public class FunctIonExample implements Function<Long, Long> {

    @Override
    public Long apply(Long aLong) {
        return aLong + 3;
    }
}

class FunctIonExample2 {
    public static void main(String[] args) {
        Function<Float, String> adder = (val) -> val.toString();
        adder.apply(5f);
    }
}
