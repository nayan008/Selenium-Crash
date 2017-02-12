package com.newtours.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class newToursDemo {
	
	WebDriver driver;

	@BeforeTest
	public void launchApp(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
	}
	
	@Test(dataProvider="getData")
	public void flightLogin(String userid, String password){
		//System.out.println(userid);
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(userid);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		//System.out.println(password);
		driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
		driver.findElement(By.xpath("//a[@href='mercurywelcome.php']")).click();
	}//end of flightLogin
	
	@Test(enabled = false)
	public void logOut(){
		driver.findElement(By.xpath("//a[@href='mercurysignoff.php']")).click();
		driver.findElement(By.xpath("//a[@href='mercurywelcome.php']")).click();
	}
	
	@DataProvider
	public Object[][] getData(){
		int i=3; //i is number of test run
		int j=2; //j is number of parameter
		Object data[][] = new Object[i][j];
		data[0][0]="guest";
		data[0][1]="guest";
		
		data[1][0]="guest";
		data[1][1]="guest";
		
		data[2][0]="guest";
		data[2][1]="guest";
		
		return data;				
	}

}
