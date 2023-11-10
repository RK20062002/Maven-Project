package org.Challenges.Day_6;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit extends BaseClass{
	
	@BeforeClass
	public static void lauchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@Before
	public void StartTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
		launchUrl("https://www.gmail.com");
	}
	
	@Test
	public void tc2() {
		System.out.println("Test Case 2");
		launchUrl("https://www.facebook.com/");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		launchUrl("https://www.inmakes.com/");
	}
	
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
		launchUrl("https://www.youtube.com");
	}
	
	@After
	public void EndTime() {
		Date d = new Date();
		System.out.println(d);
		System.out.println(" ");
	}
	
	@AfterClass
	public static void CloseBrowser() {
		closeEntireBrowser();
		System.out.println("The Test Cases are completed...");
	}
}
