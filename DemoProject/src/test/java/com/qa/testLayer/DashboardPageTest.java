package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class DashboardPageTest extends TestBase
{
	@Test
	public void verifyDashboardPageFunctionality() throws InterruptedException
	{
		login.enterEmail("shaikh786@gmail.com");
		login.enterPassword("Sabiya786@");
		login.clickOnLoginButton();

		Thread.sleep(10000);

		dashboard.enterCompanyName("Wipro");
		Thread.sleep(20);
		dashboard.clickOnCompanyName();
	}

}
