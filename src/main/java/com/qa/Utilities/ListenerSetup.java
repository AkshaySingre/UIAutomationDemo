package com.qa.Utilities;


import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {
	
	
     @Override
     public void onTestStart (ITestResult result)
     {
    	 logger.info("Test Case Execution Started");
     }
     
     @Override
     public void onTestSuccess (ITestResult result)
     {
    	 logger.info("Test Case Execution Completed");
     }
     
     @Override
     public void onTestFailure (ITestResult result)
     {
    	 logger.info("Test Case Execution Failed");
    	 UtilsClass.takeSS(result.getName()+ System.currentTimeMillis());
    	 logger.info("Test Case Failed Take Screenshot");
     }
     
     @Override
     public void onTestSkipped (ITestResult result)
     {
    	 logger.info("Test Case Execution Skipped");
     }
}
