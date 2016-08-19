package com.Selenium.WeekClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.Selenium.TestUtils.ReadProperties;

public class WebAction {

	
	WebDriver driver;   //reference only
	
	
	public void launchBrowser(){
		// Launching FF browser
		driver=new FirefoxDriver();  // Cretate object
	}
	
	public void loadingURL(){
		//loading URL in FF browser
				driver.get("http://www.rediff.com/");
	}
	public void fnClick(String locator){
		 ReadProperties rp=new  ReadProperties();
		 
		if(locator.endsWith( "_id" ))			
			driver.findElement(By.id(rp.getPropetyValue(locator))).click();
			
	 
		else if(locator.endsWith("_name" ))		
			driver.findElement(By.name(rp.getPropetyValue(locator))).click();
			
	   else if(locator.endsWith("_xpath" ))		
		driver.findElement(By.xpath(rp.getPropetyValue(locator))).click();
	 
		
	   else if(locator.endsWith("_linktext" ))		
    	driver.findElement(By.linkText(rp.getPropetyValue(locator))).click();
		 
		 
		
	}
	
	public void enterText(String locator,String testdata){
		ReadProperties rp=new  ReadProperties();
		if(locator.endsWith( "_id" ))			
			driver.findElement(By.id(rp.getPropetyValue(locator))).sendKeys(testdata);
			
	 
		else if(locator.endsWith("_name" ))		
			driver.findElement(By.name(rp.getPropetyValue(locator))).sendKeys(testdata);
			
	   else if(locator.endsWith("_xpath" ))		
		driver.findElement(By.name(rp.getPropetyValue(locator))).sendKeys(testdata);
	 
		
	   else if(locator.endsWith("_linktext" ))		
    	driver.findElement(By.name(rp.getPropetyValue(locator))).sendKeys(testdata);
		 
	}
	
	
	
 
}
