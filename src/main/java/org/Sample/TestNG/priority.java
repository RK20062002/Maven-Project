package org.Sample.TestNG;

import org.Sample.TestNG.Parameterization.Data_provider2;
import org.testng.annotations.Test;

public class priority {
	
	// The Data Provider method use another class. ----->	tc6()
	// Mention dataProvider = "name",	class of the DataProvider method. ===> dataProviderClass = ClassName.class
	
	@Test(priority = -1, dataProvider = "search", dataProviderClass = Data_provider2.class)
	private void tc6(String data) {
		System.out.println("Test Case 6");
		System.out.println(data);
	}
	
	@Test(priority = 2)
	private void tc4() {
		System.out.println("Test Case 4");
	}
	
	@Test(priority = 6)
	private void tc8() {
		System.out.println("Test Case 8");
	}
	
	@Test(priority = -2)
	private void tc2() {
		System.out.println("Test Case 2");
	}
	
	@Test(priority = 6)
	private void tc1() {
		System.out.println("Test Case 1");
	}
	
	@Test(priority = -5)
	private void tc5() {
		System.out.println("Test Case 5");
	}
}
