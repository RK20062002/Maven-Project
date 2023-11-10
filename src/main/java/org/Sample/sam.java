package org.Sample;

import org.base.BaseClass;
import org.testng.annotations.Test;

public class sam extends BaseClass{


	@Test
	private void tc1() {
		launchBrowser();
		launchUrl("https://www.flipkart.com/");
		windowMaximize();

	}
}
