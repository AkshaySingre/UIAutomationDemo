package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.LoginPage;
import com.qa.testBase.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void VerifyUserName() {
		
		
		l.enterUserName();
		l.enterPassword();
		l.clickOnLogin();
	}

}
