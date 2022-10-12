package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase
{
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}

	//quantity
	@FindBy(xpath = "//input[@name='input-Qunatity']")
	private WebElement quantity_box;

	public void enterQunatity(String quantity)
	{
		quantity_box.sendKeys(quantity);
		logger.info("Qunatity enter successfully");
	}


	//Buy button
	@FindBy(xpath = "//button[@class='w-md btn btn-success']")
	private WebElement buy_btn;

	public void clickOnBuyButton()
	{
		buy_btn.click();
		logger.info("click on buy button successfully");
	}
}
