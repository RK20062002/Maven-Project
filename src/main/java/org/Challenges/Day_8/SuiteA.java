package org.Challenges.Day_8;

import org.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuiteA extends BaseClass{

	@BeforeClass
	private void launch() {
		launchBrowser();
		windowMaximize();
	}
	
	@Test
	private void tc1() {
		launchUrl("https://www.flipkart.com");
		System.out.println("Test Case 1 Flipkart");
	}
	
	@Test
	private void tc2() {
		launchUrl("https://www.amazon.in");
		System.out.println("Test Case 2 Amazon");
	}
}
