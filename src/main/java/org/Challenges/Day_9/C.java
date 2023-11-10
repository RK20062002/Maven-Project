package org.Challenges.Day_9;

import org.testng.annotations.Test;

public class C {
	
	@Test(dataProvider = "search", dataProviderClass = B.class)
	private void tc55(String product) {
		System.out.println(product);
	}

}
