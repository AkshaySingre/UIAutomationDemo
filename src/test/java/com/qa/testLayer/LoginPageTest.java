package com.qa.testLayer;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Utilities.ReadData;
import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;


public class LoginPageTest extends TestBase{

	@Test(dataProvider = "LoginData123")
	public void VerifyAllUserLoginTest(String username, String password)
	{
		String expected_url = "https://www.saucedemo.com/inventory.html";
		LoginPage  login = new LoginPage(driver);
		login.enterUserName(username);
		login.enterPassword(password);
		login.clickOnLogin();
		
		AssertJUnit.assertEquals(login.getCurrenturl(),expected_url);
	}
	
  	@DataProvider(name = "LoginData123")
	public String [][] getData()
	{
		ReadData read =new ReadData();
		int r = read.getRowCount(0);
		int c = read.getCellCount(0,1 );
		System.out.println("Total Rows = " +r + "Total Cell =" +c );
		String[][] loginData = new String [r][c];
		
		for(int i = 1;i<=r;i++)
		{
		   for (int j = 0;j<c;j++)
		   {
			   loginData[i-1][j] = read.readData(0, i, j);
		   }
		}
		
		return loginData;
		
	}
	
	
}
