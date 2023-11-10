package org.Sample.DataDrivan;

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

// Datas are different format printed ===> Date
public class Data_Iterate {

	public static void main(String[] args) throws IOException {

		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Sample\\MultiDataType.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet excel = wb.getSheet("Sheet1");
		
		for (int i = 0; i < excel.getPhysicalNumberOfRows(); i++) {
			Row r = excel.getRow(i);
			
			// to iterate all cells from all rows
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				// Cell Type = 1 -----> String cell by default
				// Cell Type = other than 1 -----> Date cell/ Numeric Cell
				
				if (cellType ==1) {
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (DateUtil.isCellDateFormatted(c)) {   // date convert into String format
					Date dateValue = c.getDateCellValue();
					SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yy");
					String ChangedValue = s.format(dateValue);
					System.out.println(ChangedValue);
				}
				else {
					double d = c.getNumericCellValue();
					long l =(long) d;					// double value convert into long data type.
					String ConvertedValue = String.valueOf(l);
					System.out.println(ConvertedValue);
				}
				
				
			}
			
		}
	}
}
