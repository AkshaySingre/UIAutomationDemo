package com.qa.testBase;

import org.testng.annotations.BeforeMethod;

import com.qa.Utilities.ReadData;
import com.qa.Utilities.UtilsClass;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

public static WebDriver driver;
public static Logger logger;
	public ReadData rdata;
    public UtilsClass util_Obj;
	@BeforeClass
	public void start ()
	{
		logger = Logger.getLogger("SwagLab Automation Framework");
		PropertyConfigurator.configure("Log4jfile.properties");
		
		logger.info("Framework Execution Started");
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework Execution Stopped");
	}
	@BeforeMethod
    public void setUp()
	{
		String br ="chrome";
		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else if (br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if (br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else
		{
			System.out.println("Please provide correct browser name");
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		rdata = new ReadData();
		util_Obj = new UtilsClass();
		
		}
    
    
    
    
  @AfterMethod
    public void teardown()
    {
    driver.quit();
    }
    
}
