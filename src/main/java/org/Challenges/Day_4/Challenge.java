package org.Challenges.Day_4;

import java.io.IOException;

import org.base.BaseClass;

public class Challenge extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		createNewExcelFile("Challenge.xlsx");
		createRow("Challenge.xlsx", 0, 0, "Selenium");
		createCell("Challenge.xlsx", 0, 1, "Java");
		createCell("Challenge.xlsx", 0, 2, "Data Driven");
		createCell("Challenge.xlsx", 0, 3, "POM");
		createRow("Challenge.xlsx", 1, 0, "Appium");
		createCell("Challenge.xlsx", 1, 1, "Cucumber");
		createCell("Challenge.xlsx", 1, 2, "Junit");
		createCell("Challenge.xlsx", 1, 3, "TestNG");
	}
}
