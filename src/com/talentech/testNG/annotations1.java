package com.talentech.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations1 {
	
	@BeforeSuite
	public void startSuite(){
		System.out.println("This is start of test suite");
	}
	@AfterSuite
	public void endSuite(){
		System.out.println("This is end of test suite");
	}
	
	@BeforeTest
	public void openBrowser(){
		System.out.println("Opening Browser");
	}//end of openBrowser
	
	@AfterTest
	public void closeBrowser(){
		System.out.println("Closing Browser");
	}//end of closeBrowser
	
	@BeforeMethod
	public void logIn(){
		System.out.println("I am logged In");	
	}//end of logIn
	
	@AfterMethod
	public void logOut(){
		System.out.println("I am Logged Out");
		
	}//end of logOut
	
	@Test(priority = 1, enabled = false)
	public void checkStatus(){
		System.out.println("I am first test");
		
	}//end of checkStatus
	
	@Test(priority = 3, enabled = true)
	public void updateStatus(){
		System.out.println("I am second test");
		
	}//end of updateStatus
	
	@Test(priority = 2, enabled = true)
	public void deleteStatus(){
		System.out.println("I am Third test");
		
		
	}//end deleteStatus

}//end of Annotation 1
