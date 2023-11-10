package org.Challenges.Day_8;

import org.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuiteB extends BaseClass{

	@BeforeClass
	private void launch() {
		launchBrowser();
		windowMaximize();
	}
	
	@Test
	private void tc5() {
		launchUrl("https://www.inmakes.com");
		System.out.println("Test Case 5 Imakes");
	}
	
	@Test
	private void tc6() {
		launchUrl("https://www.w3school.com");
		System.out.println("Test Case 6 w3School");
	}
}
