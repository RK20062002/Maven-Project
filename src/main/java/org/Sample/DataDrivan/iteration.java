package org.Sample.DataDrivan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class iteration {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\day1_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet excel = wb.getSheet("Sheet1");
		
		// 0<4 ---> 0 to 3 index position

		for (int i = 0; i < excel.getPhysicalNumberOfRows(); i++) {  	// iterate Row from the Sheet
			
			Row row = excel.getRow(i);   	// Iterate row from 0th index to 3rd index
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {		// iterate Cell from the Sheet
				
				Cell cell = row.getCell(j);		// Iterate all Cells from Row 
				System.out.println(cell);
			}
		}
	}
}
