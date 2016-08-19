package com.Selenium.WeekClasses;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExample1 {

	
	
	@Parameters()
	@Test (description="verify the loginpage with  valid username/password",groups={"smoketest"},timeOut=2000)
	public void TC_01_loginpage(){
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("@ Test Annotation method is ---test--->loginpage)()");
	}
	
	@Test (groups={"smoketest","regressiontest"})
	public void TC_02_fillingRestration(){
		System.out.println("@ Test Annotation methods --test-- filling Restration()");
		Assert.assertTrue(true);
	}
	
	@Test  (enabled=true,groups={"regressiontest"})
	public void TC_03_logOut(){
		System.out.println("@ Test Annotation methods --test-- Logout()");
	}
	@Test (dependsOnMethods={"TC_02_fillingRestration"},groups={"smoketest","regressiontest"})
	public void TC_04_inputrequestFromTestCase(){
		
		System.out.println("@ Test Annotation method --test-TC_04_inputrequestFromTestCase()");
	}
}
