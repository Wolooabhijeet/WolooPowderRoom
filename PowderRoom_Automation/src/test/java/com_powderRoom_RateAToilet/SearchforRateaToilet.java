package com_powderRoom_RateAToilet;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.OTPPage;
import ObjectRepo.RateaToilet;
import ObjectRepo.RateaToiletSearch;
import ObjectRepo.WelcomePage;
import Utilities.BaseClass;
import Utilities.GenericUtility;
import io.appium.java_client.AppiumBy;
import ObjectRepo.RateaToiletSearch;


public class SearchforRateaToilet extends BaseClass {
	@Test
	public void TC_Wl_01_validateRateaToiletUITest() throws InterruptedException {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getNextButton().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getMobileNumTextfield().sendKeys("8874565856");
		loginPage.getOtpButton().click();

		OTPPage otpPage = new OTPPage(driver);
		otpPage.getOtpTextfield1().sendKeys("1");
		otpPage.getOtpTextfield2().sendKeys("2");
		otpPage.getOtpTextfield3().sendKeys("3");
		otpPage.getOtpTextfield4().sendKeys("4");
		otpPage.getSubmitButton().click();

		HomePage homePage = new HomePage(driver);
		Thread.sleep(2000);
		Assert.assertEquals(true, homePage.getHomeTab().isDisplayed());
		homePage.getHomeTab().click(); // till layout code click

		homePage.getRateTab().click();
		Thread.sleep(3000);
		RateaToilet Ratepage = new RateaToilet(driver);

		Assert.assertEquals(true, Ratepage.getBackButton().isDisplayed());
		Assert.assertEquals(true, Ratepage.getCurrentLocationField().isDisplayed());
		Assert.assertEquals(true, Ratepage.getWahImage().isDisplayed());
		Assert.assertEquals(true, Ratepage.getDiscreteSlider().isDisplayed());
		Assert.assertEquals(true, Ratepage.getLovedItIcon().isDisplayed());
		GenericUtility.verticalScroll(driver);
		Assert.assertEquals(true, Ratepage.getWriteReviewLayout().isDisplayed());
		Assert.assertEquals(true, Ratepage.getSubmitButton().isDisplayed());

	}

	@Test
	public void TC_Wl_02_validateSearchforrateTest() throws InterruptedException {

		{
			HomePage homePage = new HomePage(driver);
			Assert.assertEquals(true, homePage.getHomeTab().isDisplayed()); // till layout code click

			homePage.getRateTab().click();

			RateaToiletSearch Search = new RateaToiletSearch(driver);
			Search.getSearchTextField().click();

			Search.getSearchToilet().click();

			Search.getSearchToilet().sendKeys("Hotel Dhangarwada");
			WebElement location = Search.getSearchOption();

			GenericUtility.tapUsingCoordinatePercentage(driver, location, 50.0, 15.0);
			Thread.sleep(7000);
			

			Assert.assertEquals(true, Search.getShowCibilScoreText().isDisplayed());
			
			

		}	

		}
		@Test
		public void TC_Wl_03_validateAddReviewTest() throws InterruptedException {

			{
				HomePage homePage = new HomePage(driver);
				Assert.assertEquals(true, homePage.getHomeTab().isDisplayed()); // till layout code click

				homePage.getRateTab().click();

				RateaToiletSearch Search = new RateaToiletSearch(driver);
				Search.getSearchTextField().click();

				Search.getSearchToilet().click();

				Search.getSearchToilet().sendKeys("Hotel Dhangarwada");
				WebElement location = Search.getSearchOption();

				GenericUtility.tapUsingCoordinatePercentage(driver, location, 50.0, 15.0);
				Thread.sleep(7000);
				
				Assert.assertEquals(true, Search.getShowCibilScoreText().isDisplayed());
				
			//	Search.getRatingslider().click();
			//	Search.getLovedItIcon().click();
				Thread.sleep(5000);
				GenericUtility.verticalScroll(driver);

				Search.getWriteReviewImage().click();
				//Thread.sleep(5000);
				Search.getReviewInput().sendKeys("Woloo is best as alwayes");	
				GenericUtility.verticalScroll(driver);

			    Search.getSubmitButton().click();
                  				
				
				
				
			}

	
		}
}
