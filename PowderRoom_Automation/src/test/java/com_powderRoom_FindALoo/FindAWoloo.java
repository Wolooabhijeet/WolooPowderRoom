package com_powderRoom_FindALoo;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepo.CardDetailpage;
import ObjectRepo.FindALooPage;
import ObjectRepo.FindaLooBookmark;
import ObjectRepo.FindaLooEndRoute;
import ObjectRepo.FindaLooRenewSubscription;
import ObjectRepo.FindaLooShowMoreDetails;
import ObjectRepo.FindaLooTravelmode;
import ObjectRepo.HomePage;
import ObjectRepo.LoginPage;
import ObjectRepo.OTPPage;
import ObjectRepo.ProfilePeersClubMembership;
import ObjectRepo.RateaToilet;
import ObjectRepo.RateaToiletSearch;
import ObjectRepo.RazorPay;
import ObjectRepo.WelcomePage;
import Utilities.BaseClass;
import Utilities.GenericUtility;
import io.appium.java_client.AppiumBy;

public class FindAWoloo extends BaseClass {
	@Test
	public void TC_Wl_01_validateFindALooUITest() throws InterruptedException {
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
		homePage.getHomeTab().click();

		homePage.getFindALooTab().click();
		Thread.sleep(3000);
		FindALooPage looPage = new FindALooPage(driver);

		Assert.assertEquals(true, looPage.getSearchTextfield().isDisplayed());
		Assert.assertEquals(true, looPage.getSearchTextfield().isDisplayed());
		Assert.assertEquals(true, looPage.getBookmarkListImg().isDisplayed());
		Assert.assertEquals(true, looPage.getContactUsButton().isDisplayed());
		Assert.assertEquals(true, looPage.getCurrentLocationButton().isDisplayed());
		Assert.assertEquals(true, looPage.getGenericViewElement().isDisplayed());
		Assert.assertEquals(true, looPage.getLoocard().isDisplayed());
		Thread.sleep(3000);

	}

	@Test
	public void TC_Wl_02_validateCardDetailPageTest() throws InterruptedException {
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
		homePage.getFindALooTab().click(); // till layout code click
		Thread.sleep(10000);

		FindALooPage looPage = new FindALooPage(driver);
		looPage.getLoocard().click(); // clicking on the card

		CardDetailpage indetail = new CardDetailpage(driver);
		Assert.assertEquals(true, indetail.getBackButton().isDisplayed());
		// Assert.assertEquals(true, indetail.getDirectionButton().isDisplayed());
		Assert.assertEquals(true, indetail.getLikeButton().isDisplayed());
		Assert.assertEquals(true, indetail.getAddressText().isDisplayed());
		Assert.assertEquals(true, indetail.getDistanceText().isDisplayed());
		Assert.assertEquals(true, indetail.getRequiredTimeText().isDisplayed());
		Assert.assertEquals(true, indetail.getPhotoImage().isDisplayed());
		GenericUtility.verticalScroll(driver);
		Assert.assertEquals(true, indetail.getCibilImage().isDisplayed());
		// Assert.assertEquals(true, indetail.getShareButton().isDisplayed());

	}

	@Test
	public void TC_Wl_03_validateBookmarPageTest() throws InterruptedException {

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
		homePage.getFindALooTab().click(); // till layout code click
		Thread.sleep(3000);

		homePage.getFindALooTab().click();

		Thread.sleep(2000);

		FindALooPage looPage = new FindALooPage(driver);
		looPage.getLoocard().click(); // clicking on the card

		CardDetailpage card = new CardDetailpage(driver);
		Thread.sleep(2000);

		FindaLooEndRoute Route = new FindaLooEndRoute(driver);

		card.getLikeButton().click();
		card.getBackButton().click();

		looPage.getBookmarkListImg().click();
		Thread.sleep(1000);

		FindaLooBookmark book = new FindaLooBookmark(driver);
		book.getDirectionShowButton().click();
		Route.getBackFromEnroute().click();
		Thread.sleep(1000);

	}

	@Test
	public void TC_Wl_04_validateAddReviewTest() throws InterruptedException {

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
		homePage.getFindALooTab().click(); // till layout code click
		Thread.sleep(3000);

		homePage.getFindALooTab().click();

		Thread.sleep(2000);

		FindALooPage looPage = new FindALooPage(driver);
		looPage.getLoocard().click(); // clicking on the card

		GenericUtility.verticalScroll(driver);
		Thread.sleep(1000);
		CardDetailpage card = new CardDetailpage(driver);
		card.getAddReviewButton().click();
		RateaToilet rate = new RateaToilet(driver);
		GenericUtility.verticalScroll(driver);
		RateaToiletSearch Search = new RateaToiletSearch(driver);

		Search.getWriteReviewImage().click();
		// Thread.sleep(5000);
		Search.getReviewInput().sendKeys("Woloo is best as alwayes");
		GenericUtility.verticalScroll(driver);

		Search.getSubmitButton().click();

		Thread.sleep(3000);
	}

	@Test
	public void TC_Wl_05_validateShowmoreUITest() throws InterruptedException {
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
		homePage.getFindALooTab().click(); // till layout code click
		Thread.sleep(3000);

		homePage.getFindALooTab().click();

		WebElement swipecontner = driver.findElement(AppiumBy.id("in.woloo.www:id/rvHomeCategory"));

		String resource = "tv2Km";
		String text = "2 kms";
		String xpath = "//android.widget.TextView[contains(@resource-id,'" + resource + "') and contains(@text,'" + text
				+ "')]";
		boolean iscardvisible = GenericUtility.swipeAndFindElementByDirection(driver, xpath, swipecontner, "left", 11);

		FindaLooShowMoreDetails showmore = new FindaLooShowMoreDetails(driver);
		System.out.println(iscardvisible + ">>>>>>>>>>");
		if (iscardvisible) {
			WebElement cardele = driver.findElement(AppiumBy.id("in.woloo.www:id/tv_search_more"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(cardele));
			// showmore.showmoreUIValidation();
			// Thread.sleep(2000);
			System.out.println("element is found" + ">>>>>>>>>>");
			cardele.click();
			System.out.println("clicked perform" + ">>>>>>>>>>");
		}
		// Thread.sleep(1000);
		// showmore.getSearchMoreButton().click();
		Thread.sleep(1000);
		showmore.getBackDialogButton().isDisplayed();
		showmore.getOpenNowCheckbox().isDisplayed();
		showmore.getBookmarkedWolooCheckbox().isDisplayed();
		showmore.getWolooWithOffersCheckbox().isDisplayed();
		showmore.getFourKmOption().isDisplayed();
		showmore.getSixKmOption().isDisplayed();
		Thread.sleep(4000);
	}

	@Test
	public void TC_Wl_06_validateBookmarkedUITest() throws InterruptedException {
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
		homePage.getFindALooTab().click(); // till layout code click
		Thread.sleep(3000);

		homePage.getFindALooTab().click();

		WebElement swipecontner = driver.findElement(AppiumBy.id("in.woloo.www:id/rvHomeCategory"));

		String resource = "tv2Km";
		String text = "2 kms";
		String xpath = "//android.widget.TextView[contains(@resource-id,'" + resource + "') and contains(@text,'" + text
				+ "')]";
		boolean iscardvisible = GenericUtility.swipeAndFindElementByDirection(driver, xpath, swipecontner, "left", 11);

		FindaLooShowMoreDetails showmore = new FindaLooShowMoreDetails(driver);
		System.out.println(iscardvisible + ">>>>>>>>>>");
		if (iscardvisible) {
			WebElement cardele = driver.findElement(AppiumBy.id("in.woloo.www:id/tv_search_more"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(cardele));
			// showmore.showmoreUIValidation();
			// Thread.sleep(2000);
			System.out.println("element is found" + ">>>>>>>>>>");
			cardele.click();
			System.out.println("clicked perform" + ">>>>>>>>>>");
		}
		Thread.sleep(3000);
		showmore.getBookmarkedWolooCheckbox().click();

	}

	@Test
	public void TC_Wl_07_validateTravelModeTest() throws InterruptedException {
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
		homePage.getFindALooTab().click(); // till layout code click
		Thread.sleep(3000);

		homePage.getFindALooTab().click();
		FindaLooTravelmode mode = new FindaLooTravelmode(driver);
		mode.getTransportModeButton().click();
		mode.getBikeOptionButton().click();
		Thread.sleep(2000);
		mode.getBikeOptionButton().click();
		Thread.sleep(2000);
		CardDetailpage back = new CardDetailpage(driver);
		Thread.sleep(2000);
		back.getBackButton().click();
		Thread.sleep(2000);
		mode.getTransportModeButton().click();
		Thread.sleep(2000);
		mode.getWalkOptionButton().click();
		Thread.sleep(2000);
	}
}
//	@Test
//	public void TC_Wl_08_validateNoInternetConnectionTest() throws InterruptedException, IOException {
//		WelcomePage welcomePage = new WelcomePage(driver);
//		welcomePage.getNextButton().click();
//
//		// Login flow
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.getMobileNumTextfield().sendKeys("9769268752");
//		loginPage.getOtpButton().click();
//
//		OTPPage otpPage = new OTPPage(driver);
//		otpPage.getOtpTextfield1().sendKeys("1");
//		otpPage.getOtpTextfield2().sendKeys("2");
//		otpPage.getOtpTextfield3().sendKeys("3");
//		otpPage.getOtpTextfield4().sendKeys("4");
//		otpPage.getSubmitButton().click();
//		HomePage homePage = new HomePage(driver);
//
//		homePage.getFindALooTab().click(); // till layout code click
//		Thread.sleep(3000);
//
//		homePage.getFindALooTab().click();
//		Runtime.getRuntime().exec("adb shell svc wifi disable");
//		homePage.getFindALooTab().click(); // till layout code click
//
//	}

//	@Test
//	public void TC_Wl_09_validateRenewSubscriptionTest() throws InterruptedException, IOException {
//		WelcomePage welcomePage = new WelcomePage(driver);
//		welcomePage.getNextButton().click();
//
//		// Login flow
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
//		HomePage homePage = new HomePage(driver);
//
//		homePage.getFindALooTab().click(); // till layout code click
//		Thread.sleep(3000);
//		homePage.getFindALooTab().click();
//
//		FindaLooRenewSubscription renew = new FindaLooRenewSubscription(driver);
//
////		Assert.assertEquals(true, renew.getProfileIcon().isDisplayed());
////		Assert.assertEquals(true, renew.getExpiredText().isDisplayed());
//		renew.getRenewButton().click();
//		ProfilePeersClubMembership Club = new ProfilePeersClubMembership(driver);
//		Club.getRenewNowButton().click();
//
//		RazorPay pay = new RazorPay(driver);
//		pay.getUpgradeButton().click();
//		pay.getIciciBankOption().click();
//		pay.getPaymentSuccessText().click();
//		Thread.sleep(3000);
//
//	}
//
//}
