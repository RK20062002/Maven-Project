package org.Sample.Junit;

/* @ Anotation used to check multiple test cases...
 * 
 * 		@Test -----> Before every Test Cases. ------->   method name tc1,tc2,tc3... ---> tc1 means Test Case 1 
 * 		@Before ----------> This method is working before every @Test.
 * 		@After  ----------> End of @Test method.
 * 		@BeforeClass, @AfterClass ------> Using only start first and end last.  
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class sample {
	
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
	}
	
	@Before
	public void startDate() {
		// TODO Auto-generated method stub
		System.out.println("Test Case Start Date and Time");
	}
	
	@After
	public void endDate() {
		System.out.println("Test Case End Date and Time");
	}
	
	@Ignore	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}
	
	@BeforeClass
	public static void launchBrowser() {
		System.out.println("Browser Launch.....");
	}
	

	@Test
	public void tc5() {
		// TODO Auto-generated method stub
		System.out.println("Test Case 5");
	}
	
	@Test
	public void tc4() {
		// TODO Auto-generated method stub
		System.out.println("Test Casee 4");
	}
	
	@AfterClass
	public static void closeBroswer() {
		System.out.println("Close the Brower.....");
	}
}
