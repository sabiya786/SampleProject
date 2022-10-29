package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class Contact_usPage extends TestBase
{

	public Contact_usPage()
	{
		PageFactory.initElements(driver, this);
	}


	//Full Name
	@FindBy(xpath="//input[@id='fullname']")
	private WebElement full_name_box;

	public void enterFullName(String name)
	{
		full_name_box.sendKeys(name);
	}

	//Email Address
	@FindBy(xpath="//input[@class='p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-lg'][2]")
	private WebElement email_box;

	public void enterEmail(String email)
	{
		email_box.sendKeys(email);
	}

	//country code
	@FindBy(xpath="//select[@class='p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md']")
	private WebElement country_code;

	public void selectCountryCode(String code)
	{
		Select s = new Select(country_code);
		s.selectByVisibleText(code);
	}

	//Phone
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone_box;

	public void enterPhoneNumber(String phone)
	{
		phone_box.sendKeys(phone);
	}

	//Message
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement message_box;

	public void enterMessage(String msg)
	{
		message_box.sendKeys(msg);
	}

	//submit button
	@FindBy(xpath="//button[@id='contactButton']")
	private WebElement submit_btn;

	public void clickOnSubmitButton()
	{
		submit_btn.click();
	}

	@FindBy(xpath="//div[text()='Message sent successfully!']")
	private WebElement status;

	public String getStatus()
	{
		String st = status.getText();
		return st;
	}
}
