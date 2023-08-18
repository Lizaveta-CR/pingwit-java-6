package com.pingwit.core.les_25.classwork.point_3;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class MSWorFileCreationExample {
    private static final String FILE_PATH = "core/src/main/java/com/pingwit/core/les_25/classwork/point_3/meWordDocument.docx";

    public static void main(String[] args) {
        XWPFDocument document = new XWPFDocument();
        createTitle(document);
        createSubTitle(document);

        write(document);
    }

    private static void write(XWPFDocument document) {
        try(FileOutputStream fos = new FileOutputStream(FILE_PATH)){
            document.write(fos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createTitle(XWPFDocument document) {
        XWPFParagraph title = document.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun titleRun = title.createRun();
        titleRun.setText("Creating Word Document");
        titleRun.setColor("009933");
        titleRun.setBold(true);
        titleRun.setFontFamily("Courier");
        titleRun.setFontSize(20);
    }

    private static void createSubTitle(XWPFDocument document) {
        XWPFParagraph subTitle = document.createParagraph();
        subTitle.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun subTitleRun = subTitle.createRun();
        subTitleRun.setText("from HTTP fundamentals to API Mastery");
        subTitleRun.setColor("00CC44");
        subTitleRun.setFontFamily("Courier");
        subTitleRun.setFontSize(16);
        subTitleRun.setTextPosition(20);
        subTitleRun.setUnderline(UnderlinePatterns.DOT_DOT_DASH);
    }
}
