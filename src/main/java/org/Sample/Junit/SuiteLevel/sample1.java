package org.Sample.Junit.SuiteLevel;

import org.junit.Test;

/* Suite Level Execution:-
		Run the collection of test cases from more than one class
		Types :-
			Way 1
			Way 2
*/
public class sample1 {
	@Test
	public void tc10() {
		System.out.println("Test Case 10");
	}
	
	@Test
	public void tc11() {
		System.out.println("Test Case 11");
	}
	
	@Test
	public void tc12() {
		System.out.println("Test Case 12");
	}

}
