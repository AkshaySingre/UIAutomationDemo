package com.qa.pageLayer;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	  private WebDriver driver;
	  public ProductPage (WebDriver driver)
	  {
		  this.driver = driver;
	  	PageFactory.initElements(driver, this);
	  }
	     
	     @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']")
	     private WebElement backpack;
	     
	     @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bike-light']")
	     private WebElement bike_light;
	     
	     @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	     private WebElement bolt_t_shirt;
	     
	     @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	     private WebElement fleece_jacket;
	   
	     @FindBy(xpath ="//a[@class='shopping_cart_link']")
	     private WebElement linkcart;
	     
	  
	     
	     public void scrolldn()
	     
	     {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("scroll(0,200)");
	  	   
	     }
	   public void AddToCart()
	     
	     {
		   backpack.click();
		   bike_light.click();
		   bolt_t_shirt.click();
		   fleece_jacket.click();
	  	 
	     }
	   public void scrolldup()
	     
	     {
	    	JavascriptExecutor js = ((JavascriptExecutor)driver);
	    	js.executeScript("scroll(0,-200)");
	  	   
	     }
	  public void linkCart()
	  {
		  linkcart.click();
	  }
     
	
}
