package com.talentech.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class annotations2 {
	
	@Test(dataProvider="getData")
	public void flightLogin(String userid, String password){
		System.out.println(userid);
		System.out.println(password);
		
	}//end of flightLogin
	
	@DataProvider
	public Object[][] getData(){
		int i=3; //i is number of test run
		int j=2; //j is number of parameter
		Object data[][] = new Object[i][j];
		data[0][0]="user1";
		data[0][1]="pass1";
		
		data[1][0]="user2";
		data[1][1]="pass2";
		
		data[2][0]="user3";
		data[2][1]="pass3";
		
		return data;				
	}

}
