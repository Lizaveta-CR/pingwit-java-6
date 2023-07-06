package com.pingwit.core.les_17.classwork.point_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class OIS_Example {

    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_17/classwork/point_1/object";

    public static void main(String[] args) {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Person person = (Person) oos.readObject();
            System.out.println(person);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
