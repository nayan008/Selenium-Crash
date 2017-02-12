package com.talentech.testNG;

import org.testng.annotations.Test;

public class annotations3 {
	
	@Test(groups = {"priority1"})
	public void groupTest1(){
		System.out.println("This is priority group 1");
		
	}
	
	@Test(groups = {"priority1"})
	public void groupTest2(){
		System.out.println("This is priority group 1");
		
	}
	
	@Test(groups = {"priority2"})
	public void groupTest3(){
		System.out.println("This is priority group 2");
		
	}

}
