package org.Sample.POM;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {

	// 1. Non parameterized Constructor
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	// 2. Private Web Elements
	// WebElement email = driver.findElement(By.id("email"));

	// FindAll Anotation
	
	@FindAll({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@name='email']"),
			@FindBy(xpath = "//input[@autocomplete='username']") })
	
	private WebElement varRef;

	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginbtn;

	// 3. Getters to access WebElements outside the class ----> right click-->
	// Source-->Generate getters & setters

	public WebElement getVarRef() {
		return varRef;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
