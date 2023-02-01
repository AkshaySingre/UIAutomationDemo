package com.qa.testLayer;



import org.testng.annotations.Test;

import com.qa.Utilities.ReadData;
import com.qa.pageLayer.CheckOutPage;
import com.qa.pageLayer.Checkout_Information;
import com.qa.pageLayer.LoginPage;
import com.qa.pageLayer.ProductPage;
import com.qa.testBase.TestBase;

import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ProductPageTest extends TestBase {

	@Test
	public void verifyUserFlow()
	{                                 
		String expected_url = "https://www.saucedemo.com/checkout-complete.html";
		LoginPage  login = new LoginPage(driver);
		ProductPage pp = new ProductPage (driver);
		CheckOutPage cp = new CheckOutPage(driver);
		Checkout_Information CI = new Checkout_Information(driver);
		ReadData rd = new ReadData();
		
		
		//LoginPage
		login.enterUserName(rd.readData(0, 1, 0));
		login.enterPassword(rd.readData(0, 1, 1));
		login.clickOnLogin();
		
		//ProductPage
		pp.scrolldn();
		pp.AddToCart();
		pp.scrolldup();
		pp.linkCart();
		
		logger.info("Product addded to cart");
		//CheckOutPage
		cp.CheckScrolldn();
		cp.Click_on_Checkout();
		
		//Checkout_Information
		CI.CheckScrollUp();
		CI.EnterUserInformation(rd.readData(1, 1, 0),rd.readData(1, 1, 1), rd.readData(1, 1, 2));
		CI.CheckScrolldn();
		CI.ClickOnContinue();
		CI.FinishScrolldn();
		CI.ClickOnFinish();
		AssertJUnit.assertEquals(CI.getCurrenturl(),expected_url);
	}
	
}
