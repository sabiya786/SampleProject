package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class UtilClass extends TestBase
{
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}

	//screenshot
	public static void getScreenshot(String nameOfScreenshot)
	{
		String path = "D:\\Workplace\\SampleProject\\Quality-Assurance\\Screenshot\\";

		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path+nameOfScreenshot+System.currentTimeMillis()+".png");

		try
		{
			FileHandler.copy(src, dest);
		}
		catch(IOException e)
		{
			logger.info("Choose the correct file");
		}
	}

}
