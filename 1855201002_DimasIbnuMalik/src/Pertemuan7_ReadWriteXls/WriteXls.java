/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7_ReadWriteXls;

/**
 *
 * @author Dimas
 */
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class WriteXls {

    public static void main(String[] args) {
        try {
            //Membuat Dokumen Excel
            FileOutputStream fos = new FileOutputStream("D:\\SEKOLAH\\TugasAlgoritmaPemrograman\\WriteExample.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("My Worksheet");

            //Membuat Baris Pertama
            HSSFRow row1 = worksheet.createRow((short) 0);

            //Membuat Cell di A1
            HSSFCell cellA1 = row1.createCell((short) 0);
            cellA1.setCellValue("NOMOR");

            //Membuat Cell di B1
            HSSFCell cellB1 = row1.createCell((short) 1);
            cellB1.setCellValue("NAMA");

            //Membuat Cell di C1
            HSSFCell cellC1 = row1.createCell((short) 2);
            cellC1.setCellValue("STATUS");

//            Membuat Cell di D1
            HSSFCell cellD1 = row1.createCell((short) 3);
            cellD1.setCellValue("KET");

            //Save the workbook in .xls file
            workbook.write(fos);
            fos.flush();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
