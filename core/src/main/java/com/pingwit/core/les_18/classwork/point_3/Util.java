package com.pingwit.core.les_18.classwork.point_3;

public class Util {

    public static <K extends Number, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }
}
