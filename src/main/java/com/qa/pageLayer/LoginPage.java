package com.qa.pageLayer;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

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
   
   public void enterUserName(String username)
   
   {
	   Username.click();
	   Username.sendKeys(username);
	   
   }
 public void enterPassword(String password)
   
   {
	 Password.click();
	 Password.sendKeys(password);
	 
   }
 public void clickOnLogin()
 
 {
	 Login.click();
	   
 }
  
   
}
