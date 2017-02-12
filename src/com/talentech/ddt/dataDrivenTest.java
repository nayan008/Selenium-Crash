package com.talentech.ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class dataDrivenTest {

	public static void main(String[] args) throws IOException {
		dataDrivenTest ddt = new dataDrivenTest();
		ddt.login();

	}//end of main
	
	public void login() throws IOException{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/mahbubsiddique/Documents/workspace/Selenium Projects/Selenium Crash/src/com/talentech/ddt/ddt.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("userId"));
		System.out.println(prop.getProperty("userPass"));
		System.out.println(prop.getProperty("url"));
		
	}//end of login

}//end of dataDrivenTest
