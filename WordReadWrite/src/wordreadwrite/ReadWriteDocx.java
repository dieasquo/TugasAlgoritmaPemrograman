/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author dell
 */
public class ReadWriteDocx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            File filenya = new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\docx.docx");
            FileInputStream file = FileInputStream(filenya.getPath());
            //Read
            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());

            //Write
            String outDocEn = "E://writeDocx.docx";

            XWPFDocument docx = new XWPFDocument();
            XWPFParagraph tmpParagraph = docx.createParagraph();
            XWPFRun tmpRun = tmpParagraph.createRun();
            tmpRun.setText(fileText);
            FileOutputStream out = new FileOutputStream(new File(outDocEn));
            docx.write(out);
            out.close();

//            
//            XWPFDocument documents = new XWPFDocument();
//            FileOutputStream out = new FileOutputStream(new File(outDocEn));
//            
//            
//            XWPFParagraph paragraph = documents.createParagraph();
//            XWPFRun run = paragraph.createRun();
//            run.setText(fileText);
//            document.write(out);
//            out.close();
            System.out.println("Generate DOC sukses");

        } catch (Exception exep) {
            exep.printStackTrace();
        }
    }

}
