package com.pingwit.core.les_17.classwork.point_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZIP_Out_Example {

    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_17/classwork/point_3/song.txt";

    public static void main(String[] args) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(FILE_PATH))) {
            ZipEntry zipEntry;
            String name;
            long size;
            while ((zipEntry = zis.getNextEntry()) != null) {
                name = zipEntry.getName();
                size = zipEntry.getSize();
                System.out.printf("File name is: %s File size: %d", name, size);

                FileOutputStream fos = new FileOutputStream("core/src/main/java/com/pingwit/core/les_17/classwork/point_3/" + name);
                for (int i = zis.read(); i != -1; i = zis.read()) {
                    fos.write(i);
                }

                fos.flush();
                zis.closeEntry();
                fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
