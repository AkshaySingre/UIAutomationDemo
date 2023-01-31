package com.qa.testLayer;

import org.testng.annotations.Test;


import com.qa.testBase.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void VerifyloginTest() throws InterruptedException {
		
		
		login_obj.enterUserName(read_data.readData("loginData", 1, 0));
	
		login_obj.enterPassword(read_data.readData("loginData", 1, 1));
		
		login_obj.clickOnLogin();
	}

}
