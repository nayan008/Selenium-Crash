package com.talentech.testNG;

import org.testng.annotations.Test;

public class annotations5 {
	@Test
	public void openBrowser(){
		
		System.out.println("Opening Browser");
		
	}//end of openBrowser
	
	public void closeBrowser(){
		System.out.println("Closing Browser");
		
	}//close Browser
	//timeout exits from running the method if it takes more than the time mentioned
	@Test(timeOut = 5000)
	public void gotoHomePage(){
		
		System.out.println("going to home page");
	}
	
	//dependsOnMethod run the prerequisite first.  alwaysRun makes sure even the 
	//prerequisite fails, the test runs
	@Test(dependsOnMethods = {"openBrowser"}, alwaysRun = true)
	public void login(){
		
		System.out.println("Logging In");
		
	}//end of login
	//enable = false will cause testNG to avoid running the test
	@Test (enabled=false)
	public void logout(){
		
		System.out.println("logging out");
		
	}//end of logout

}
