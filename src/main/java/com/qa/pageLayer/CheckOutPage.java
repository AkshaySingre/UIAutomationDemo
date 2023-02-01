package com.qa.pageLayer;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {

	
	 private WebDriver driver;
	  public CheckOutPage  (WebDriver driver)
	  {
		  this.driver = driver;
	  	PageFactory.initElements(driver, this);
	  }
	  
	     @FindBy(xpath ="//button[@id='checkout']")
	     private WebElement CheckOut;
	     
  public void CheckScrolldn()
	     
	     {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("scroll(0,400)");
	  	   
	     }
	  public void Click_on_Checkout()
	  {
		  CheckOut.click();
	  }
	  
	
}
