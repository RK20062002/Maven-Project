package org.Challenges.Day_5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit {

	@BeforeClass
	public static void startProgram() {
		System.out.println("Launch Program....");
		System.out.println(" ");
	}
	
	@Before
	public void startTime() {
		System.out.println("Starting Time ....");
		
	}
	
	@Test
	public void tc1() {
		System.out.println("Unit 1 Success");
		
	}
	
	@Test
	public void tc3() {
		System.out.println("Unit 3 Success");
		
	}
	
	@Test
	public void tc2() {
		System.out.println("Unit 2 Success");
		
	}
	
	@After
	public void endTime() {
		System.out.println("End Time.....");
		System.out.println(" ");
	}
	
	@AfterClass
	public static void closeProgram() {
		System.out.println("Close the Program....../");
	}
	
}
