package com.example.demo.service.impl;

import com.example.demo.service.PpfService;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.*;

import static com.itextpdf.text.pdf.PdfLayer.createTitle;

/**
 * @program: Dsh
 * @description:
 * @author: dongshuhao
 * @create: 2024-03-13 16:04
 **/
@Service
public class PpfServiceImpl implements PpfService {
    public Document get() throws Exception {
        File file =new File("D:\\a.pfd");
        FileOutputStream os=new FileOutputStream(file);
        Document document = new Document(PageSize.A4);
        PdfWriter instance = PdfWriter.getInstance(document, os);
        document.open();

        // add content - pdf meta information
        document.addAuthor("pdai");
        document.addCreationDate();
        document.addTitle("pdai-pdf-itextpdf");
        document.addKeywords("pdf-pdai-keyword");
        document.addCreator("pdai");

        // add content -  page content

        // Title
        document.add(createTitle("Java 全栈知识体系"));

        document.close();

        return document;

    }
    private Paragraph createTitle(String content) throws IOException, DocumentException {
        Font font = new Font(getBaseFont(), 24, Font.BOLD);
        Paragraph paragraph = new Paragraph(content, font);
        paragraph.setAlignment(Element.ALIGN_CENTER);
        return paragraph;
    }
    private BaseFont getBaseFont() throws IOException, DocumentException {
        return BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
    }
}
