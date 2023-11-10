package org.Sample.DataDrivan;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeData {
	
	public static void main(String[] args) throws IOException {
		File f = new File("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Sample\\newFile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet createSheet = w.createSheet("Data");
		Row newRow = createSheet.createRow(0);
		Cell newCell = newRow.createCell(0);
		newCell.setCellValue("Names");
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}
}
