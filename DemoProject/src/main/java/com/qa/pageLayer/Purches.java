package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class Purches extends TestBase
{
	public Purches()
	{
		PageFactory.initElements(driver, this);
	}

	public String checkTitle() {
		String title=driver.getTitle();
		return title;
	}

	@FindBy(xpath="//a[text()='destination of the week! The Beach!']")
	private WebElement destination;
	public void clickondestination() {
		destination.click();
	}


	//*****select city*****
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement selectcity;
	public void selectcity() {
		Select s=new Select(selectcity);
		s.selectByVisibleText("Mexico City");


	}

	//******select destination city******

	@FindBy(xpath="//select[@name='toPort']")
	private WebElement destinationcity;
	public void destinationcity() {
		Select s=new Select(destinationcity);
		s.selectByVisibleText("London");

	}	

	//*****find flight  button******

	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement flightbutton;
	public void clickonflightbutton() {
		flightbutton.click();
	}
	
//  *****choose this flight button******

    @FindBy(xpath="(//input[@class='btn btn-small'])[3]")

    private WebElement chooseflight;

    public void clickonchooseflight() {

                    chooseflight.click();

                   

    }


	//NAME

	@FindBy(xpath="//input[@placeholder='First Last']")

	private WebElement name;

	public void entername(String a) {

		name.sendKeys(a);



	}



	//Address

	@FindBy(xpath="//input[@id='address']")

	private WebElement address;

	public void enteraddress(String b) {

		address.sendKeys(b);



	}



	//city

	@FindBy(id="city")

	private WebElement city;

	public void entercity(String c) {

		city.sendKeys(c);



	}



	//State

	@FindBy(xpath="//input[@id='state']")

	private WebElement state;

	public void enterstate(String d) {

		state.sendKeys(d);



	}



	//zipcode

	@FindBy(xpath="//input[@id='zipCode']")

	private WebElement zipcode;

	public void enterzipcode(String e) {



		zipcode.sendKeys(e);



	}



	//cardtype

	@FindBy(id="cardType")

	private WebElement cardtype;

	public void selectcardtype() {

		Select s=new Select(cardtype);

		s.selectByVisibleText("Visa");



	}



	//creditno

	@FindBy(xpath="//input[@id='creditCardNumber']")

	private WebElement creditno;

	public void entercreditno(String f) {

		creditno.sendKeys(f);



	}



	//month

	@FindBy(xpath="//input[@id='creditCardMonth']")

	private WebElement month;

	public void entermonth(String g) {

		month.sendKeys(g);



	}



	//year

	@FindBy(xpath="//input[@id='creditCardYear']")

	private WebElement year;

	public void enteryear(String h) {

		year.sendKeys(h);



	}



	//name on card

	@FindBy(xpath="//input[@id='nameOnCard']")

	private WebElement nameoncard;

	public void enternameoncard(String i) {

		nameoncard.sendKeys(i);



	}



	//checkbox

	@FindBy(xpath="//input[@id='rememberMe']")

	private WebElement checkbox;

	public void clickoncheckbox() {

		checkbox.click();



	}
	//purchaseflight button

	@FindBy(xpath="//input[@class='btn btn-primary']")

	private WebElement purchaseflightbutton;

	public void clickonpurchaseflightbutton() {

		purchaseflightbutton.click();

	}
	
	
	@FindBy(xpath="(//td)[2]")
	private WebElement id;
	public void getid() {
		String r=id.getText();
		logger.info(r);
	}

}
