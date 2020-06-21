/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordreadwrite;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

/**
 *
 * @author dell
 */
public class ReadDoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File filenya = new File("C:\\Users\\dell\\Documents\\NetBeansProjects\\WordReadWrite\\coba.doc");
        WordExtractor extractor = null;
        try {
            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            String fileText = extractor.getText();
            System.out.println(fileText);
        } catch (Exception exep) {
            exep.printStackTrace();
        }
    }

}
