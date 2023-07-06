package com.pingwit.core.les_17.classwork.point_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class File_Example {

    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_17/classwork/point_2/data.txt";

    public static void main(String[] args) throws IOException {
        File file = new File(FILE_PATH);
        try {
            file.createNewFile();

            FileWriter fileWriter = new FileWriter(FILE_PATH);
            fileWriter.write("Data");
            fileWriter.close();

//            file.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text = Files.readString(Path.of(FILE_PATH));
        System.out.println(file.getAbsolutePath());
        System.out.println(text);
    }
}
