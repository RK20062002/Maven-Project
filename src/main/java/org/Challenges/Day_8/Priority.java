package org.Challenges.Day_8;

import java.util.Date;

import org.Sample.POM.fblogin_pojo;
import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority extends BaseClass{

	@BeforeClass
	private void launch() {
		launchBrowser();
		windowMaximize();
		System.out.println("Browser Launched.....\n");
	}
	
	@BeforeMethod
	private void StartTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test(priority = 2)
	private void tc1() {
		launchUrl("https://www.Gmail.com");
		System.out.println("Test Case 1");
	}
	
	@Test(priority = 1)
	private void tc2() {
		launchUrl("https://www.inmakes.com");
		System.out.println("Test Case 2");
	}
	
	@Test(priority = 5)
	private void tc3() {
		launchUrl("https://www.Redbus.com");
		System.out.println("Test Case 3");
	}
	
	@Test(priority = -1)
	private void tc4() {
		launchUrl("https://www.flipkart.com");
		System.out.println("Test Case 4");
	}
	
	@Test(priority = -5)
	private void tc5() {
		launchUrl("https://www.amazon.in");
		System.out.println("Test Case 5");
	}
	
	@Test(priority = 8)
	private void tc6() {
		launchUrl("https://www.facebook.com");
		fblogin_pojo f = new fblogin_pojo();
		passText("ranjith", f.getEmail());
		passText("Ranjith2002", f.getPassword());
		clickBtn(f.getLoginbtn());
		System.out.println("Test Case 6");
	}
	
	@Test(priority = -8)
	private void tc7() {
		launchUrl("https://www.youtube.com");
		System.out.println("Test Case 7");
	}
	
	@AfterMethod
	private void EndTime() {
		Date d = new Date();
		System.out.println(d);
		System.out.println(" ");
	}
	
	@AfterClass
	private void close() {
		closeEntireBrowser();
		System.out.println("Browser closed....");

	}
}
