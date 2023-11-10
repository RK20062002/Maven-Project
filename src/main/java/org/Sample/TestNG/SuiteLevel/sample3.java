package org.Sample.TestNG.SuiteLevel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample3 {

	
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
	private void tc12() {
		System.out.println("Test Case 12");

	}
	
	@Test
	private void tc18() {
		System.out.println("Test Case 18");

	}
	
	@Test
	private void tc15() {
		System.out.println("Test Case 15");

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
