package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase
{
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}

	//Email
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email_box;

	public void enterEmail(String email)
	{
		email_box.sendKeys(email);
		logger.info("Email id enter successfully");
	}

	//Password
	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass_box;

	public void enterPassword(String pass)
	{
		pass_box.sendKeys(pass);
		logger.info("Paaword enter successfully");

	}

	//login button
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	private WebElement login_button;

	public void clickOnLoginButton()
	{
		login_button.click();
		logger.info("click on login button successfully");

	}

}
