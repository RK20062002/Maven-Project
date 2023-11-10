package org.Sample.TestNG.Parameterization;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/* Parameterization :-
 * 		It means Send inputs datas to testng.xml file 
 * 		
 * 		Types:-
 * 			Parameter,		
 * 			Data provider,	
 * 			Data driven Framework.	--->  Sendkeys method to send data into xml file
 */

public class Parameter extends BaseClass{

	@Parameters({"username","password"})
	@Test
	private void tc1(@Optional("abc@gmail.com")String email,@Optional("1234566") String pass) {
		launchBrowser();
		windowMaximize();
		launchUrl("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys(email);
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys(pass);
		
	}
}
