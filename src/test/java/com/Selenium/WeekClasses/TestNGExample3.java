package com.Selenium.WeekClasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample2 {

	
	
	@BeforeTest
	public void setup(){
		System.out.println("@Before Annoation --setUp()");
	}

	@AfterTest
	public void teardown(){
		
		System.out.println("@AfterMethod ---teardown()");
		
	}
	@Test(groups={"smoketest"})
	public void testA(){
		System.out.println("@Test Annotation --test- methods name is-testA()");
	}
	
	@Test
	public void testB(){
		System.out.println("@Test Annotation --test- methods name is-testB()");
	}
	
}