package com.pingwit.core.les_8.classwork.point_3;

public class Main {

    public static void main(String[] args) {
        System.out.println(Fruit.BANANA);
        Fruit apple = Fruit.APPLE;
        System.out.println(apple);
        Fruit banana = Fruit.valueOf("BANANA");
        System.out.println(banana);
//        Fruit none = Fruit.valueOf("BlaBla");
        System.out.println("======");

        Direction east = Direction.EAST;
        System.out.println(east);
        System.out.println(east.getShortCode());
        System.out.println(Direction.NORTH.getShortCode());

        boolean equals = east == Direction.EAST;
        System.out.println(equals);
    }
}
