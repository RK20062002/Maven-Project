package org.Sample.TestNG.Assert;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//	AssertAll() is used to check the test case pass or fail and after the codes and also checked execute or not. 

public class assertAll extends BaseClass{

	@BeforeClass
	private void launch() {
		launchBrowser();
	}
	
	@Test					// -------------------------------------->>>>>>>>>>>>  Soft Assert
	private void tc2() {
		System.out.println("Test Case 2....\n");
		launchUrl("https://www.facebook.com/");
		windowMaximize();
		
		String title = pageTitle();
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("9715435855");
		
		SoftAssert s = new SoftAssert();
		s.assertTrue(title.contains("facebook"), "Check Your Title");
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("rk20062002");
		
		s.assertAll();
	}
	
}
