package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class Contact_usPageTest extends TestBase
{
	@Test
	public void verifyContactusPageFunctionality()
	{
		contact.enterFullName("xyz");
		contact.enterEmail("xyz@gmail.com");
		contact.selectCountryCode("India (+91)");
		contact.enterPhoneNumber("1234567890");
		contact.enterMessage("Hello");
		contact.clickOnSubmitButton();
		
		String exp_res ="Message sent successfully!";
		Assert.assertEquals(contact.getStatus(),exp_res);
	}

}
