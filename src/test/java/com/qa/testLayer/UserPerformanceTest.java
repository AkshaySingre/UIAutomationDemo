package com.qa.testLayer;



import org.testng.annotations.Test;

import com.qa.Utilities.ReadData;
import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;




public class UserPerformanceTest extends TestBase {
	@Test
	public void VerifyPageLoadTest()
	{
		LoginPage  login = new LoginPage(driver);
		ReadData rd = new ReadData();
		long s = System.currentTimeMillis();
		
		//LoginPage
		login.enterUserName(rd.readData(0, 4, 0));
		login.enterPassword(rd.readData(0, 4, 1));
		login.clickOnLogin();
		
		long e = System.currentTimeMillis();
		
		long r = e - s;
		
		System.out.println("Page load time in milisecond  :" + r);
	}
	
	

}

