package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase
{

	@Test
	public void verifyLoginPageFunctionality() throws InterruptedException
	{
		login.enterEmail("shaikh786@gmail.com");
		login.enterPassword("Sabiya786@");
		login.clickOnLoginButton();

	}

}
