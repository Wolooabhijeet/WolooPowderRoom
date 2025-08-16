package com_powderRoom_LoginTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.ConsentPage;
import ObjectRepo.LoginPage;
import ObjectRepo.OTPPage;
import ObjectRepo.RegisterationPage;
import ObjectRepo.WelcomePage;
import Utilities.BaseClass;
import Utilities.ListenerImpUtility;

@Listeners(ListenerImpUtility.class)
public class NewUserRegisterTest extends BaseClass {
	
	@Test
	public void verifyNewUserConsentScreenTest()
	{
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getNextButton().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getMobileNumTextfield().sendKeys("8080707081");
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
		
		consentPage.getDenyButton().click();
		
		RegisterationPage registerPage=new RegisterationPage(driver);
		
		Assert.assertEquals(true,registerPage.getNameTextfield().isDisplayed());
		Assert.assertEquals(true,registerPage.getEmailTextfield().isDisplayed());
		Assert.assertEquals(true,registerPage.getCityTextfield().isDisplayed());
		Assert.assertEquals(true,registerPage.getPincodeTextfield().isDisplayed());
		Assert.assertEquals(true,registerPage.getAddressTextfield().isDisplayed());
		Assert.assertEquals(true,registerPage.getdOBTextfield().isDisplayed());
		Assert.assertEquals(true,registerPage.getGenderTextfield().isDisplayed());
		Assert.assertEquals(true,registerPage.getSubmitButton().isDisplayed());
		
		registerPage.getNameTextfield().sendKeys("woloo001");
		registerPage.getEmailTextfield().sendKeys("wolooapp@gmail.com");
		registerPage.getCityTextfield().sendKeys("Bengaluru, Karanataka, India");
		registerPage.getPincodeTextfield().sendKeys("560023");
		registerPage.getAddressTextfield().sendKeys("No 5o , 1st main road");
		registerPage.getdOBTextfield().sendKeys("13 Jun 2025");
		registerPage.getGenderTextfield().sendKeys("Male");
		registerPage.getSubmitButton().click();
		
		
		
	}

}
