package com.pingwit.core.les_16.classwork.point_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Buff_Example {

    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_16/classwork/point_1/resources/input.txt";
    private static final String FILE_PATH_BOS = "core/src/main/java/com/pingwit/core/les_16/classwork/point_1/resources/notes.txt";

    public static void main(String[] args) {
        bos();
        bis();
    }

    private static void bis() {
        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void bos() {
        String text = "Hello world!";
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH_BOS);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            byte[] bytes = text.getBytes();
            bos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
