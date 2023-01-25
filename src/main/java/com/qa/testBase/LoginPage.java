package com.qa.testBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
   public LoginPage ()
{
	PageFactory.initElements(driver, this);
}
   
   @FindBy(xpath ="//input[@id='user-name']")
   private WebElement Username;
   
   @FindBy(xpath="//input[@id='password']")
   private WebElement Password;
   
   @FindBy(xpath="//input[@id='login-button']")
   private WebElement Login;
   
   public void enterUserName()
   
   {
	   Username.click();
	   Username.sendKeys("standard_user");
	   
   }
 public void enterPassword()
   
   {
	 Password.click();
	 Password.sendKeys("secret_sauce");
	   
   }
 public void clickOnLogin()
 
 {
	 Login.click();
	   
 }
  
   
}
