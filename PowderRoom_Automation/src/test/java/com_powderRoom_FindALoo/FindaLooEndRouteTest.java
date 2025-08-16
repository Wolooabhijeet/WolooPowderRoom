package com_powderRoom_FindALoo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepo.CardDetailpage;
import ObjectRepo.FindaLooEndRoute;
import ObjectRepo.FindaLooSearch;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.OTPPage;
import ObjectRepo.WelcomePage;
import Utilities.BaseClass;
import Utilities.GenericUtility;
import io.appium.java_client.AppiumBy;

public class FindaLooEndRouteTest extends BaseClass {
	@Test
	public void TC_Wl_01_validateEndRouteUITest() throws InterruptedException {
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
		// Thread.sleep(10000);
		homePage.getHomeTab().click();
		// Thread.sleep(10000);
		homePage.getFindALooTab().click();
		Thread.sleep(2000);
		FindaLooSearch Search = new FindaLooSearch(driver);

		Search.getSearchAutoComplete().click();

		FindaLooEndRoute EndRoute = new FindaLooEndRoute(driver);

		Assert.assertEquals(true, EndRoute.getBackFromEnroute().isDisplayed());
		Assert.assertEquals(true, EndRoute.getBackFromEnroute().isDisplayed());
		Assert.assertEquals(true, EndRoute.getCurrentLocationLayout().isDisplayed());
		Assert.assertEquals(true, EndRoute.getDestinationLocationLayout().isDisplayed());
		Assert.assertEquals(true, EndRoute.getStartNavigationButton().isDisplayed());
		Assert.assertEquals(true, EndRoute.getRequiredTimeText().isDisplayed());
		Assert.assertEquals(true, EndRoute.getDistanceText().isDisplayed());
		Thread.sleep(2000);

	}

	@Test
	public void TC_Wl_02_validateSearchEndRouteTest() throws InterruptedException {

//		WelcomePage welcomePage = new WelcomePage(driver);
//		welcomePage.getNextButton().click();
//
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.getMobileNumTextfield().sendKeys("8874565856");
//		loginPage.getOtpButton().click();
//
//		OTPPage otpPage = new OTPPage(driver);
//		otpPage.getOtpTextfield1().sendKeys("1");
//		otpPage.getOtpTextfield2().sendKeys("2");
//		otpPage.getOtpTextfield3().sendKeys("3");
//		otpPage.getOtpTextfield4().sendKeys("4");
//		otpPage.getSubmitButton().click();

		HomePage homePage = new HomePage(driver);
		Thread.sleep(2000); // Optional short wait after login
		Assert.assertEquals(true, homePage.getHomeTab().isDisplayed());

		homePage.getHomeTab().click();
		homePage.getFindALooTab().click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("in.woloo.www:id/search_auto_complete")));
		FindaLooSearch search = new FindaLooSearch(driver);
		Thread.sleep(4000);
		search.getSearchAutoComplete().click();
		FindaLooEndRoute EndRoute = new FindaLooEndRoute(driver);
		EndRoute.getDestinationLocationLayout().click();
		search.getSearchAutoComplete().click();

		search.getSearchAutoComplete().sendKeys("Bengaluru, Karnataka, India");
		Thread.sleep(2000);
		GenericUtility.tapUsingCoordinatePercentage(driver, driver.findElement(AppiumBy.id("android:id/content")), 50.0,
				14.0);

		// WebElement location = search.getSearchAutoComplete();

		// GenericUtility.tapUsingCoordinatePercentage(driver, location, 50.0, 15.0);

		Thread.sleep(5000);
		WebElement Distance = EndRoute.getDistanceText();
		System.out.println(Distance.getText());
		Assert.assertEquals(true, Distance.isDisplayed());

		WebElement Time = EndRoute.getRequiredTimeText();
		System.out.println(Time.getText());
		Assert.assertEquals(true, Time.isDisplayed());
		Thread.sleep(2000);
//		CardDetailpage validate = new CardDetailpage(driver);
//		String ExpectedDistance = validate.getDistanceText().getText();
//		WebElement ExpectedTime = validate.getRequiredTimeText();

	}

}