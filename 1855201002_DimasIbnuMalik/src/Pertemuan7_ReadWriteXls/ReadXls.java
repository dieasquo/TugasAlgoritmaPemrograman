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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class ReadXls {

    public static void main(String[] args) throws IOException {
        xlsRead("D:\\SEKOLAH\\TugasAlgoritmaPemrograman\\fileXlsSample.xls");
    }

    public static void xlsRead(String urlexcel) throws FileNotFoundException, IOException {
        HSSFWorkbook myxls = new HSSFWorkbook(new FileInputStream(urlexcel));
        HSSFSheet mysheet = myxls.getSheet("Sheet1");
        FormulaEvaluator formulaEva = myxls.getCreationHelper().createFormulaEvaluator();

        for (Row row : mysheet) {
            for (Cell cell : row) {
                switch (formulaEva.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "\t\t");
                }

            }
            System.out.println("");
        }
    }
}
