package org.Challenges.Day_9;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A extends BaseClass{

	@Parameters({"username","password"})
	@Test
	private void tc1(String email, String pass) {
		launchUrl("https://www.facebook.com");
		windowMaximize();
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys(email);
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys(pass);
	}
}
