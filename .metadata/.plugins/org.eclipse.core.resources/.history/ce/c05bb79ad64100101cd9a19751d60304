package com_powderRoom_LoginTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepo.ConsentPage;
import ObjectRepo.LoginPage;
import ObjectRepo.OTPPage;
import ObjectRepo.RegisterationPage;
import ObjectRepo.WelcomePage;
import Utilities.BaseClass;

public class NewUserRegisterTest extends BaseClass {
	
	@Test
	public void verifyNewUserConsentScreenTest()
	{
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getNextButton().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getMobileNumTextfield().sendKeys("9090909090");
		loginPage.getOtpButton().click();

		OTPPage otpPage = new OTPPage(driver);
		otpPage.getOtpTextfield1().sendKeys("1");
		otpPage.getOtpTextfield2().sendKeys("2");
		otpPage.getOtpTextfield3().sendKeys("3");
		otpPage.getOtpTextfield4().sendKeys("4");
		otpPage.getSubmitButton().click();
		
		ConsentPage consentPage=new ConsentPage(driver);
		Assert.assertEquals(true,consentPage.getConsentText().isDisplayed());
		Assert.assertEquals(true,consentPage.getAccessText().isDisplayed());
		Assert.assertEquals(true,consentPage.getDenyButton().isDisplayed());
		Assert.assertEquals(true,consentPage.getAcceptButton().isDisplayed());
		
		RegisterationPage registerPage=new RegisterationPage(driver);
		registerPage.getNameTextfield().sendKeys("woloo001");
		registerPage.getEmailTextfield().sendKeys("wolooapp@gmail.com");
		registerPage.getCityTextfield().sendKeys("Bengaluru, Karanataka, India");
		registerPage.getPincodeTextfield().sendKeys("560023");
		registerPage.getAddressTextfield().sendKeys("No 5o , 1st main road");
		registerPage.getdOBTextfield().sendKeys("13 Jun 2025");
		
	}

}
