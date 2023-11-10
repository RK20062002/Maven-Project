package org.Challenges.Day_7;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.Sample.POM.fblogin_pojo;
import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Junit4 extends BaseClass{

	@Before
	public void StartTime() {
		launchBrowser();
		windowMaximize();
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
		launchUrl("https://www.gmail.com/");
		String pageTitle = pageTitle();
		System.out.println(pageTitle);
		Assert.assertEquals("Check Your URL", pageTitle, "Gmail");
		WebElement email = driver.findElement(By.name("identifier"));
		passText("ranjithm114@mail.com", email);
	}
	
	@Test
	public void tc2(){
		System.out.println("Test Case 2");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test Case 1");
	}
}
