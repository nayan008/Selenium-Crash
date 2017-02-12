package com.talentech.ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class newToursCommon {
	
	WebDriver driver = null;
	
	
	@Test
	public void login() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/mahbubsiddique/Documents/workspace/Selenium Projects/Selenium Crash/src/com/talentech/ddt/ddt.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("userId"));
		//System.out.println(prop.getProperty("userPass"));
		//System.out.println(prop.getProperty("url"));
		//System.out.println(prop.getProperty("browser"));
		
		if (prop.getProperty("browser").equals("firefox")){
			driver = new FirefoxDriver();
		}//end if firefox
		
		else if (prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
		}//end else if chrome
		else {
			driver = new FirefoxDriver();
		}//end else
	}//end of login

}//end of newToursCommon
