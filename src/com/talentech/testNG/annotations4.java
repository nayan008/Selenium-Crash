package com.talentech.testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class annotations4 {
	
	@Test
	@Parameters({"userId","userPass"})
	
	public void login(String userId, String userPass){
		System.out.println(userId);
		System.out.println(userPass);
		
	}//end of login

}
