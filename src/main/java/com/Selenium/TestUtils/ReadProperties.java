package com.Selenium.TestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

	public String getPropetyValue(String key){
		String value=null;
		Properties prop = new Properties();
		
		try{
			
			File myfile=new File("C:/Users/Sravya/SeleniumFrameworkWeekendBatch/src/main/resource/Objects.properties");
			FileInputStream input=	new FileInputStream(myfile);
			// load a properties file
			prop.load(input);
			
			value=prop.getProperty(key);
			System.out.println("Print value --->"+value);
					
		}catch(Exception e){
			
		}
		return value;
	}
	
	public static void main(String[] args) {
	 
		ReadProperties rp=new ReadProperties();
		String proptyvalue=rp.getPropetyValue("username_id");
	}

}
