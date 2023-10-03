package com.pingwit.database.les_4.classwork;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class RefMain {

    public static void main(String[] args) {
        String title = "Java Head First";//strong
        WeakReference<StringBuilder> reference = new WeakReference<>(new StringBuilder());
        SoftReference<StringBuilder> softReference = new SoftReference<>(new StringBuilder());
    }
}
