package org.Sample.Junit;

/* Assert method:-
 * 		Static method --- className.methodName();
 * 		assertTrue(msg,cond) --- method
 * 		assertEquals(msg, exp, act) --- method
 */

import java.util.Date;

import org.Sample.POM.FbLoginPojo;
import org.Sample.POM.fblogin_pojo;
import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junit3 extends BaseClass{

	@BeforeClass
	public static void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@Before
	public void startDate() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc1() throws InterruptedException {
		System.out.println("Test Case 1");
		launchUrl("https://www.snapdeal.com/");
	}
	
	@Test
	public void tc2() {
		System.out.println("Test Case 2");	
		launchUrl("https://www.facebook.com/");
		String title = pageTitle();
		String url = pageUrl();
		fblogin_pojo f = new fblogin_pojo();
		passText("ranjith100@mail.com", f.getEmail());
		Assert.assertTrue("Check Your Page Title", title.contains("facebook"));
		passText("9715435855", f.getPassword());
	}
	
	@Ignore
	@Test
	public void tc4() {
		System.out.println("Test Case 4");
		launchUrl("https://www.myntra.com/");
	}
	
	@Test
	public void tc5() {
		System.out.println("Test Case 5");
		launchUrl("https://www.flipkart.com/");
	}
	
	@After
	public void endDate() {
		Date d = new Date();
		System.out.println(d);
		System.out.println(" ");
	}
	
	@AfterClass
	public static void closeTheBroswer() {
	//	closeEntireBrowser();
		
	}

}
