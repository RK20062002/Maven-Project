package org.Sample.TestNG.Assert;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SoftAssert extends BaseClass{

	@BeforeClass
	private void launch() {
		launchBrowser();
	}
	
	@Test					// ------------------------------------->>>>>>>>>>   Hard Assert
	private void tc1() {
		System.out.println("Test Case 1....\n");
		launchUrl("https://www.facebook.com/");
		windowMaximize();
		
		String title = pageTitle();
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("ranjithmoorthy100@gmail.com");
		
		Assert.assertTrue(title.contains("facebook"), "CHECK YOUR PAGE TITLE.....");		//  HardAssert
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("rk20062002");
		
	}
	
	@Test					// -------------------------------------->>>>>>>>>>>>  Soft Assert
	private void tc2() {
		System.out.println("Test Case 2....\n");
		launchUrl("https://www.facebook.com/");
		windowMaximize();
		
		String title = pageTitle();
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("9715435855");
		
		org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();		// softAssert
		s.assertTrue(title.contains("facebook"), "CHECK YOUR PAGE TITLE");
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("rk20062002");
	}
}
