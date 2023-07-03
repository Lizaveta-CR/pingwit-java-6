package com.pingwit.core.les_16.classwork.point_1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOS_Example {
    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_16/classwork/point_1/resources/output.txt";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {
            fos.write("\n".getBytes());
            fos.write("Hello from Java".getBytes());

            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
