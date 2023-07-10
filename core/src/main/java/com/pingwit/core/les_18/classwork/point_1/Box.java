package com.pingwit.core.les_18.classwork.point_1;

//public class Box<T1, T2, ... Tn>{}
public class Box<T> {
    private T object;//T stands for Type
//    private static T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
