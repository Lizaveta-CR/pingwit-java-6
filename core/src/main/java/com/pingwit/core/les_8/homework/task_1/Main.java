package com.pingwit.core.les_8.homework.task_1;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box("Box 1", 10);
        Box box2 = new Box("Box 2", 20);
        Box box3 = new Box("Box 3", 30);
        Box box4 = new Box("Box 4", 40);

        Box[] boxes = {box1, box2, box3, box4};
        Warehouse warehouse = new Warehouse(boxes);

        for (int i = 0; i < 5; i++) {
            System.out.println(warehouse.next().name());
        }
    }
}
