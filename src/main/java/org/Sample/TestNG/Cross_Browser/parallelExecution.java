package org.Sample.TestNG.Cross_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//		CrossExecution is used to execute more than one web browser at the same time
//				Methods level cross browser

public class parallelExecution {
	
	@Test
	private void tc1() {
		System.out.println("Test Case 1"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}
	
	@Test
	private void tc2() {
		System.out.println("Test Case 2 :"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys("9715435855");
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("rk20062002");

	}
	
	@Test
	private void tc3() {
		System.out.println("Test Case 2 :"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

}
