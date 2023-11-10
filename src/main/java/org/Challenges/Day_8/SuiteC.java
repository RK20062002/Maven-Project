package org.Challenges.Day_8;

import org.base.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SuiteC extends BaseClass{

	@BeforeClass
	private void launch() {
		launchBrowser();
		windowMaximize();
	}
	
	@Test
	private void tc8() {
		launchUrl("https://www.youtube.com");
		System.out.println("Test Case 8 YouTube");
	}
	
	@Test
	private void tc9() {
		launchUrl("https://www.facebook.com");
		System.out.println("Test Case 9 FaceBook");
	}
}
