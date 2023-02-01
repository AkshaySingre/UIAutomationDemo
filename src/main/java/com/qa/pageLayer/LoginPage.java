package com.qa.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	  private WebDriver driver;
	  public LoginPage (WebDriver driver)
	  {
		  this.driver = driver;
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
	    	 Username.sendKeys(username);
	  	   
	     }
	   public void enterPassword(String password)
	     
	     {
	  	 Password.sendKeys(password);
	  	 
	     }
	   
	   public void clickOnLogin()
	   
	   {
	  	 Login.click();
	  	   
	   }
	    
	   public String getCurrenturl()
	   {
		   return driver.getCurrentUrl();
	   }
	   
	     

}
