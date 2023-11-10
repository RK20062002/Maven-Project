package org.Challenges.Day_8;

import java.util.Date;

import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TagAnnotations extends BaseClass{

	@BeforeClass
	private void Launch() {
		launchBrowser();
		windowMaximize();
		System.out.println("Browser Launched...!");
		System.out.println(" ");
	}
	
	@BeforeMethod
	private void StartTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	private void tc1() {
		launchUrl("https://www.Gmail.com");
	}
	
	@Test
	private void tc2() {
		launchUrl("https://www.inmakes.com");
	}
	
	@Test
	private void tc3() {
		launchUrl("https://www.redBus.com");
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
		System.out.println("Browser Closed...!");
	}
	
	
}
