package com.pingwit.core.les_17.classwork.point_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZIP_Example {
    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_17/classwork/point_3/song.txt";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("song.zip");
             ZipOutputStream zos = new ZipOutputStream(fos);
             FileInputStream fis = new FileInputStream(FILE_PATH)) {
            ZipEntry entry = new ZipEntry("song.txt");
            zos.putNextEntry(entry);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zos.write(buffer);
            zos.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
