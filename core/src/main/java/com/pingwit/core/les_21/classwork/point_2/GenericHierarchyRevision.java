package com.pingwit.core.les_21.classwork.point_2;

import java.util.ArrayList;
import java.util.List;

//Collection<A>, Collection<B>
//B extends A
//Collection<B> extends Collection<A>???
public class GenericHierarchyRevision {

    public static void main(String[] args) {
        String str = "Test";
        Object obj = str;

        List<Object> objects2 = new ArrayList<>();
        objects2.add(str);

        List<String> strings = new ArrayList<>();
//        List<Object> objects = strings;
    }
}
