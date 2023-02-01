package com.qa.pageLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_Information {
	
	 private WebDriver driver;
	  public Checkout_Information  (WebDriver driver)
	  {
		  this.driver = driver;
	  	PageFactory.initElements(driver, this);
	  }
	  
	     @FindBy(xpath ="//input[@id='first-name']")
	     private WebElement Firstname;
        
	     @FindBy(xpath ="//input[@id='last-name']")
	     private WebElement Lastname;
	
	     @FindBy(xpath ="//input[@id='postal-code']")
	     private WebElement Zipcode;

	     @FindBy(xpath ="//input[@id='continue']")
	     private WebElement Continue;
	     
	     @FindBy(xpath ="//button[@id='finish']")
	     private WebElement Finish;
  public void CheckScrollUp()
	     
	     {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("scroll(0,-300)");
	  	   
	     }
  public void EnterUserInformation(String fn, String ln, String string)
  
  {
	  Firstname.sendKeys(fn);
	  Lastname.sendKeys(ln);
	  Zipcode.sendKeys(String.valueOf(string));;
  }
  
  public void CheckScrolldn()
  
  {
 	JavascriptExecutor js = ((JavascriptExecutor)driver);
 	js.executeScript("scroll(0,300)");
	   
  }
  
  public void ClickOnContinue()
  {
	  Continue.click(); 
  }
 public void FinishScrolldn()
  
  {
 	JavascriptExecutor js = ((JavascriptExecutor)driver);
 	js.executeScript("scroll(0,800)");
	   
  }
  public void ClickOnFinish()
  {
	  Finish.click(); 
  }
  
  
	   public String getCurrenturl()
	   {
		   return driver.getCurrentUrl();
	   }
	   
}
