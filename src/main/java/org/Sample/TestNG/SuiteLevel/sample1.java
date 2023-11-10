package org.Sample.TestNG.SuiteLevel;

/*Suite Level Execution:
 * 		select classes 
 * 		Right click --> TestNG --> Convert TestNG
 * 		refresh project.
 * 		scroll down click testng.xml file
 * 		run testng.xml file.
 */

import java.util.Date;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample1 {
	
	@Test
	private void tc3() {
		System.out.println("Test Case 3");

	}
	
	@Test
	private void tc9() {
		System.out.println("Test Case 9");

	}
	
	@Test
	private void tc1() {
		System.out.println("Test Case 1");

	}
	
	@BeforeMethod
	private void StartTime() {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@AfterMethod
	private void EndTime() {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		System.out.println(" ");
	}
	
	@org.testng.annotations.BeforeClass
	private void launchTheBrowser() {
		// TODO Auto-generated method stub
		System.out.println("Launch the Browser");
	}
	
	@AfterClass
	private void closeBroser() {
		// TODO Auto-generated method stub
		System.out.println("Close the Browser");
	}

}
