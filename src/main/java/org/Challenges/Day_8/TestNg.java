package org.Challenges.Day_8;

import java.util.Date;

import org.Sample.POM.fblogin_pojo;
import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg extends BaseClass{
	
	@BeforeClass
	private void launch() {
		launchBrowser();
		windowMaximize();
		System.out.println("Browser Launched...");
	}
	
	@BeforeMethod
	private void StartTime() {	
		Date d = new Date();
		System.out.println(d);
		
	}
	
	@Test
	private void tc1() {
		launchUrl("https://www.facebook.com/");
		fblogin_pojo f = new fblogin_pojo();
		passText("9715435855", f.getEmail());
		passText("RK20062002", f.getPassword());
		clickBtn(f.getLoginbtn());

	}

	@AfterMethod
	private void EndTime() {
		Date d = new Date();
		System.out.println(d);
		System.out.println(" ");
	}
	
	@AfterClass
	private void close() {
		closeEntireBrowser();
		System.out.println("Browser closed...!");
	}
	
	
}
