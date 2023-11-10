package org.Sample.POM;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fbLoginPojo2 extends BaseClass{
	public static void main(String[] args) {
		
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		windowMaximize();
		
		FbLoginPojo f = new FbLoginPojo();
		passText("Ranjith", f.getVarRef());
		passText("rk20062002", f.getPassword());
		clickBtn(f.getLoginbtn());
	}

}
