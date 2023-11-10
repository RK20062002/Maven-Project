package org.Sample.Junit.SuiteLevel;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass_Way2 {

	
	@Test
	public void tc() {
		Result rc = JUnitCore.runClasses(sample1.class,sample2.class,sample3.class);
		
		System.out.println("Total Test Case Run count : "+rc.getRunCount());
		System.out.println("Total Test Case Run time : "+rc.getRunTime());
		System.out.println("Total Test Case Failure : "+rc.getFailureCount());
		System.out.println("Total Test Case Ingnored : "+rc.getIgnoreCount());
		
		List<Failure> failures = rc.getFailures();
		for (Failure fails : failures) {
			System.out.println(fails);
		}
	}
}
