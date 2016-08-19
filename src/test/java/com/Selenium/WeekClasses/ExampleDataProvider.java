package com.Selenium.WeekClasses;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleDataProvider {

	
	
	@BeforeTest
	public void setup(){
		
		System.out.println("setup");
	}
	@AfterTest
	public void teardown(){
		
		System.out.println("close");
	}
	
	@Test(dataProvider="gmailuserdetails")
	public void gmailLoginTest(String username,String password){
		 System.out.println(username + " " + password);

	/*	System.out.println("username from dataprovider----->"+username);
		System.out.println("password from dataprovider----->"+password);*/
	}
	
	@DataProvider(name="gmailuserdetails")
	public Object[][]  generateData(){
		
		return new Object[][] {
				   { "username", "seleniumtraning@gmail.com" },
				   { "password", "selenium123"},
				   { "password", "selenium123"}
				 };

	}
}
