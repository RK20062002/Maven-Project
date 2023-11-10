package org.Sample.TestNG.Parameterization;

import org.Sample.POM.fblogin_pojo;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*	 huge data(positive & negative) passed to single test case.
 *	 We using 2 dimensional array ---->  Object[a][b]
 *	 [a] ----------->   To read Row
 *	 [b] ----------->   To read Colom
 *
 *	 Syntax:-
 *		methods(){
 *			return new Object[][]{
 *				...
 *				}
 *		} 
 */

public class Data_provider extends BaseClass{
	
	@DataProvider(name = "tc1")
	private Object[][] data() {
		return new Object[][] {
			{"ranjithm114@gmail.com","ranjithKumar"},
			{"ranjithm114@gmail.com","rk20062002"},
			{"9715435855","ranjithKumar"},
			{"9715435855","rk20062002"},
			
		};
		
	}

	@Test(dataProvider = "tc1")
	private void tc1(String email, String pass) {
		launchBrowser();
		windowMaximize();
		launchUrl("https://www.facebook.com/");
		WebElement emailId = driver.findElement(By.id("email"));
		emailId.sendKeys(email);
		
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys(pass);
		
		fblogin_pojo f = new fblogin_pojo();
		clickBtn(f.getLoginbtn());
		
		
	}
}
