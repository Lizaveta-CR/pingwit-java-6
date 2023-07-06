package com.pingwit.core.les_17.classwork.point_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class MsWordReadExample {

    public static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_17/classwork/point_4/pingwit.pl_анализ_конверсий.docx";

    public static void main(String[] args) {
        File docx = new File(FILE_PATH);
        try (FileInputStream fis = new FileInputStream(docx)) {
            XWPFDocument document = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = document.getParagraphs();
            for (XWPFParagraph doc : paragraphs) {
                System.out.println(doc.getText());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
