package org.Sample.Junit;

import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit2 extends BaseClass{
	
	@BeforeClass
	public static void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("hppts://www.facebook.com/");
	}
	
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		launchUrl("https://www.snapdeal.com/");	
	}
	
	@Ignore
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
		launchUrl("https://www.myntra.com/");
	}
	
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
		launchUrl("https://www.flipkart.com/");
	}
	
	@After
	public void endDate() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterClass
	public static void closeTheBroswer() {
		closeEntireBrowser();
		System.out.println(" ");
	}

}
