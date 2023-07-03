package com.pingwit.core.les_16.classwork.point_5;

import java.io.FileWriter;
import java.io.IOException;

public class FWExample {
    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_16/classwork/point_5/eminem_lose_yourself.txt";

    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            fw.write("\n");
            fw.write("to be continued...");

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
