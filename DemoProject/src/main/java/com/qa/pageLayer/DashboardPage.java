package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase
{
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}


	//enter company name in searchbox 
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_box;

	public void enterCompanyName(String companyName)
	{
		search_box.sendKeys(companyName);
		logger.info("company name "+companyName);

	}

	//click on company name
	@FindBy(linkText="WIPRO")
	private WebElement company_name;

	public void clickOnCompanyName()
	{
		Actions a = new Actions(driver);
		a.moveToElement(company_name).click().build().perform();
		logger.info("click on company name successfully");

	}

}
