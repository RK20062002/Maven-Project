package org.Sample.TestNG.SuiteLevel;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class sample2 {
	
	@BeforeClass
	private void lauch() {
		// TODO Auto-generated method stub
		System.out.println("Launch the Browser");
		System.out.println(" ");
	}
	
	@BeforeMethod
	private void StartTime() {
		// TODO Auto-generated method stub
		System.out.println("Start Time");
	}

	@Test
	private void tc2() {
		System.out.println("Test Case 2");

	}
	
	@Test
	private void tc8() {
		System.out.println("Test Case 8");

	}
	
	@Test
	private void tc5() {
		System.out.println("Test Case 5");

	}
	
	@AfterMethod
	private void EndTime() {
		// TODO Auto-generated method stub
		System.out.println("End Time");
		System.out.println(" ");
	}
	
	@AfterClass
	private void close() {
		// TODO Auto-generated method stub
		System.out.println("Close the Browser");
	}
	
}
