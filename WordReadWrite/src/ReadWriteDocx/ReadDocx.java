/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReadWriteDocx;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.zip.ZipInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
//import org.xml.sax.SAXException;
import java.util.zip.ZipEntry;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Dimas
 */
public class ReadDocx {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParserConfigurationException, SAXException {

            File files = new File("D://SEKOLAH//TugasAlgoritmaPemrograman//docx.docx");
            FileInputStream file = new FileInputStream(files);

            ZipInputStream docx = new ZipInputStream(file);

            ZipEntry zipEntry;
            OutputStream out;
            String xml = "";

            while ((zipEntry = docx.getNextEntry()) != null) {
                if (zipEntry.toString().equals("word/document.xml")) {
                    byte[] buffer = new byte[1024 * 4];
                    long count = 0;
                    int n = 0;
                    long size = zipEntry.getSize();
                    out = System.out;

                    while (-1 != (n = docx.read(buffer)) && count < size) {
                        xml += new String(buffer, 0, n);
                        count += n;

                    }
                }
            }

            InputStream is = new ByteArrayInputStream(xml.getBytes("UTF-8"));
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factory.newDocumentBuilder();

            org.w3c.dom.Document document = parser.parse(is);
            //error

       NodeList section = document.getElementsByTagName("w:t");
       String isiDocx  = "";
       for (int i =0; i<section.getLength(); i++){
           isiDocx += section.item(i).getFirstChild().getNodeValue();
       }
       
            System.out.println(isiDocx);
       
        
     

    }
}
