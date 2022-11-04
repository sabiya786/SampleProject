package com.qa.pageLayer;

import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class WelcomePage extends TestBase
{

	public WelcomePage()
	{
		PageFactory.initElements(driver, this);
	}
}
