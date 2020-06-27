/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author dell
 */
public class ReadWriteDoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File filenya = new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\WordReadWrite\\coba.doc");
        WordExtractor extractor = null;
        try {
            //Read
            
            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String fileText = extractor.getText();

            //Write
            
            Properties prop = new Properties();
            prop.setProperty("log4j.rootLogger", "WARN");

           
            String outDocEn = "E://writeDoc.doc";
            XWPFDocument documents = new XWPFDocument();
            FileOutputStream out = new FileOutputStream(new File(outDocEn));
            XWPFParagraph paragraph = documents.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText(fileText);
            document.write(out);
            out.close();
            System.out.println("Generate DOC sukses");

        } catch (Exception exep) {
            exep.printStackTrace();
        }
    }

}
