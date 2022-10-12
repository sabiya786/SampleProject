package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class ExchangePageTest extends TestBase
{
	@Test
	public void verifyExchangePageFunctionality() throws InterruptedException
	{

		login.enterEmail("shaikh786@gmail.com");
		login.enterPassword("Sabiya786@");
		login.clickOnLoginButton();

		Thread.sleep(10000);

		dashboard.enterCompanyName("Wipro");
		dashboard.clickOnCompanyName();

		Thread.sleep(2000);

		exchange.enterQunatity("2");
		exchange.clickOnBuyButton();

	}

}
