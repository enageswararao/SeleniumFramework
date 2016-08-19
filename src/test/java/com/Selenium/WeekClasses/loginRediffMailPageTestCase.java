package com.Selenium.WeekClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginRediffMailPageTestCase extends WebAction {
 
	
	   
	@Test
	public void loginIntoRediffMail() throws InterruptedException{
		
		//Open the Browser
		launchBrowser();
		//loading URL
		loadingURL();
		Thread.sleep(3000);
		//Clikck on Money on the rediff homepage
		fnClick("money_xpath");
		//Click on My Protofolio
		fnClick("myportfolio_xpath");
		//Enter the Your email addresss...
		enterText("userEmailAddrs_id", "nag.sel.training@rediff.com");
		fnClick("emailSubmitbtn_name");
		Thread.sleep(3000);
		//Enter the password
		enterText("userEmailPwd_name", "abnctest");
	
		fnClick("submitloginbtn_name");
	
	}

}
