package org.Challenges.Day_3;

import java.io.IOException;

import org.base.BaseClass;

public class Challenge1 extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		createNewExcelFile("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx");
		createRow("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 0, 0, "Selenium");
		createCell("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 0, 1, "Java");
		createCell("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 0, 2, "Data Driven");
		createCell("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 0, 3, "POM");
		createRow("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 1, 0, "Appium");
		createCell("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 1, 1, "Cucumber");
		createCell("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 1, 2, "Junit");
		createCell("E:\\Software Testing\\Eclipse_Commiters\\MavenProject\\Excel\\Challenges\\Day_3.xlsx", 1, 3, "TestNG");
	}
}
