package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class Listerners extends TestBase implements ITestListener
{


	public void onTestStart(ITestResult result) 
	{
		logger.info("Test case execution start");
	}


	public void onTestSuccess(ITestResult result) 
	{
		logger.info("Testcase execution done successfully");
	}


	public void onTestFailure(ITestResult result) 
	{
		logger.info("Test case failed");
		UtilClass.getScreenshot(result.getName());
	}


	public void onTestSkipped(ITestResult result) 
	{

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{

	}


	public void onTestFailedWithTimeout(ITestResult result) 
	{

	}


	public void onStart(ITestContext context) 
	{

	}

	public void onFinish(ITestContext context) 
	{

	}

}
