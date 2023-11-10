package org.base;

// using web elements to another programs ( email, password, login )

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin_pojo extends BaseClass{
	
	// 1. Non parameterized Constructor
	public fblogin_pojo() {
		PageFactory.initElements(driver, this);
	}
	
	// 2. Private Web Elements
	// WebElement email = driver.findElement(By.id("email"));
	
	@FindBy(xpath="//input[@data-testid='royal_email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='pass']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginbtn;

	// 3. Getters to access WebElements outside the class ----> right click-->
	// Source-->Generate getters & setters
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}





}
