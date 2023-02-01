package com.qa.Utilities;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;
   // 
public class UtilsClass extends TestBase {
	
	public UtilsClass()
	{
		PageFactory.initElements(driver, this);
	}

	
	public static void takeSS(String filename)
	{
		String path = "C:\\Users\\akshay.singre\\git\\repository\\UIAutomationDemo\\Screenshot";
		
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File (path+filename+" .png");
		FileHandler.copy(src, des);
		
		} catch (IOException e) {
			System.out.println("File not Found for storing ScreenShot Please Provide Correct Path");
			e.printStackTrace();
		}
		
	}
}
