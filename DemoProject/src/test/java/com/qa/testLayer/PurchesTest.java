package com.qa.testLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.testBase.TestBase;

public class PurchesTest extends TestBase
{

	SoftAssert assrt=new SoftAssert();

	String expectedTitle="Welcome to the Simple Travel Agency!";


	@Test

	public void check() throws InterruptedException {


		assrt.assertEquals(purches.checkTitle(),expectedTitle);


		purches.clickondestination();


		driver.navigate().back();

		purches.selectcity();

		purches.destinationcity();

		purches.clickonflightbutton();



		Thread.sleep(10);

		purches.clickonchooseflight();

		purches.entername("Rekha Pagar");

		purches.enteraddress("BANGLORE");

		purches.entercity("banglore");

		purches.enterstate("karnatka");

		purches.enterzipcode("423104");



		JavascriptExecutor js=((JavascriptExecutor)driver);

		js.executeScript("scroll(0,400)");

		purches.selectcardtype();

		purches.entercreditno("540088455504");

		purches.entermonth("2");

		purches.enteryear("2022");

		purches.enternameoncard("rekha pagar");

		purches.clickoncheckbox();

		purches.clickonpurchaseflightbutton();

		purches.getid();
	}         


}
