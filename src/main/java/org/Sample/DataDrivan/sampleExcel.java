package org.Sample.DataDrivan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sampleExcel {

	public static void main(String[] args) throws IOException {
		
		// Mention File path
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Sample\\SampleDatas.xlsx");
		
		// To read the file
		FileInputStream fis = new FileInputStream(f);
		
		// To read .xlsx file format
		Workbook wb = new XSSFWorkbook(fis);
		
		// To get Sheet from workbook
		Sheet Mysheet = wb.getSheet("Data");
		
		// To Get row from sheet
		Row row = Mysheet.getRow(2);
		
		// To get cell from row
		Cell cell = row.getCell(1);
		System.out.println(cell);
		
	}
}
