package com.pingwit.core.les_18.classwork.point_3;

public class PairMain {

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        Pair<String, String> p3 = new Pair<>("2", "pear");
        boolean same = Util.<Integer, String>compare(p1, p2);
//        Util.compare(p2, p3);
        System.out.println(same);
    }
}
