package org.Sample.TestNG.Cross_Browser.Class_Level;

//==================================Class Level Execution is like as suite level execution ======================================================//

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classA {
	
	@Test
	private void tc1() {
		System.out.println("Test Case 1"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}
	
	@Test
	private void tc3() {
		System.out.println("Test Case 3 :"+Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

	}

}
