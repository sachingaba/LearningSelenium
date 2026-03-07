package com.thetestingacademy.resources;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class utilExcel {

    public static String path = System.getProperty("user.dir")+"src/test/java/com/thetestingacademy/resources/utilExcel.xlsx";

    Workbook book;
    Sheet sheet;

    public Object[][] getDataFromExcel(String SheetName){

        try {
            FileInputStream fis = new FileInputStream(path);
            book = WorkbookFactory.create(fis);
            sheet = book.getSheet(SheetName);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
                data[i][j] =sheet.getRow(i+1).getCell(j).toString();

            }

        }

return data;
    }
}
