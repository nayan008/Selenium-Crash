package com.talentech.ddt;

import java.io.IOException;

import org.testng.annotations.Test;

public class inheritanceDemo extends newToursCommon{
	
	@Test
	public void loginNewTours() throws IOException{
		
		login();
		
	}//end of loginNewTours


}
