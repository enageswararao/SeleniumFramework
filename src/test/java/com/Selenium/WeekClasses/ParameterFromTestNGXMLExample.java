package com.Selenium.WeekClasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterFromTestNGXMLExample {

	
	@BeforeTest
	public void setup(){
		System.out.println("Before Test ");
	}
	
	@AfterTest
	public void teardown(){
		System.out.println("After Test");
	}
	
	@Parameters({ "username","password" } )
	@Test
	public void testLogin(String username,String password){
		
		System.out.println("parameter value from testngxml-->"+username);
		System.out.println("parameter value from testngxml-->"+password);
	}
}
