package org.Sample.TestNG.Cross_Browser.Class_Level;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classC {
	
	@Test
	private void tc3() {
		System.out.println("Test Case 2 :"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();

	}

	@Test
	private void tc1() {
		System.out.println("Test Case 1"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();

	}

}
