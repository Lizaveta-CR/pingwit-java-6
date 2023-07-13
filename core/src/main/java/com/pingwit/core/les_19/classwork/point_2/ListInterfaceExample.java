package com.pingwit.core.les_19.classwork.point_2;

import java.util.ArrayList;
import java.util.List;

interface A {}

public class ListInterfaceExample {

    public static void main(String[] args) {
        List<ClassB> list = new ArrayList<>();
        list.add(new ClassB());
        list.add(new ClassC());
//        list.add(new ClassA());
    }
}

class ClassA implements A {}

class ClassB implements A {}

class ClassC extends ClassB {}
