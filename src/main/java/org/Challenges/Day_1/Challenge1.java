package org.Challenges.Day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Challenge1 {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\day1_data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet excel = wb.getSheet("Sheet1");

		Row row = excel.getRow(1);

		Cell cell = row.getCell(0);

		System.out.println("2 Row & 1st Cell : " + cell);
	}
}
