package org.Sample.TestNG;

import java.util.Date;

import org.Sample.POM.fblogin_pojo;
import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample1 extends BaseClass{
	
	@Test(invocationCount = 2)			// InvocationCount is used to run multiple times
	private void tc3() {
		launchUrl("http://www.flipkart.com/");
	}
	
	@Test(enabled = false)				// enabled = flase ---> is used to ignore test case.
	private void tc9() {
		launchUrl("https://www.amazon.in/");

	}
	
	@Test
	private void tc1() {
		launchUrl("https://www.facebook.com/");
		fblogin_pojo f = new fblogin_pojo();
		passText("9715435855", f.getEmail());
		passText("rk20062002", f.getPassword());

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
	
	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
	private void closeBroser() {
		System.out.println("Close the Browser");
	}
}
