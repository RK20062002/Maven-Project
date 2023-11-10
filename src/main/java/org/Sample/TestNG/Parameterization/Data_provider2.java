package org.Sample.TestNG.Parameterization;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider2 extends BaseClass{

	@DataProvider(name = "search")
	public Object data() {
		return new Object[][] {
			{"iphone"},
			{"Shoes"},
			{"Mens Watch"},
			{"Play Station"}
		};
	}
	
	@Test(dataProvider = "search")
	private void tc1(String datas) {
		launchBrowser();
		windowMaximize();
		launchUrl("https://www.amazon.in/");
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys(datas);
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
	}
}
