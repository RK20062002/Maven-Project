package org.Challenges.Day_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data3 {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day1.Data3.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet excel = wb.getSheet("Data 3");
		
		for (int i = 0; i < excel.getPhysicalNumberOfRows(); i++) {
			Row row = excel.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
			//	System.out.println(cell);
				int cellType = cell.getCellType();
			
				
				if (cellType==1) {
					String stringValue = cell.getStringCellValue();
					System.out.println(stringValue);
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date DateValue = cell.getDateCellValue();
					SimpleDateFormat sDate = new SimpleDateFormat("dd-MMM-yy");
					String ChangedValue = sDate.format(DateValue);
					System.out.println(ChangedValue);
				}
				else {
					double n = cell.getNumericCellValue();
					long l = (long) n;
					String CovertedValue = String.valueOf(l);
					System.out.println(CovertedValue);
				}
			}
		}
		
	}
}
