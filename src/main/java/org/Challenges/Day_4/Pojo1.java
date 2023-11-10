package org.Challenges.Day_4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pojo1 {

	public Pojo1() {
		
	}
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")
	private WebElement phoneNo;
	
	@FindBy(xpath="//button[contains(text(),'Request OTP')]")
	private WebElement otpbtn;

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getOtpbtn() {
		return otpbtn;
	}
}
