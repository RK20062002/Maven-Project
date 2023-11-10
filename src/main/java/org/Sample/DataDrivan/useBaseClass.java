package org.Sample.DataDrivan;

import java.io.IOException;

import org.base.BaseClass;

public class useBaseClass extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		createNewExcelFile("useBaseClass.xlsx");
		createRow("useBaseClass.xlsx", 0, 1, "Data Driven");
		createRow("useBaseClass.xlsx", 1, 2, "Selenium");
		createCell("useBaseClass.xlsx", 0, 0, "TestNG");
		updateDataToParticularCell("useBaseClass.xlsx", 0, 0, "TestNG", "Manual");
		}
}
