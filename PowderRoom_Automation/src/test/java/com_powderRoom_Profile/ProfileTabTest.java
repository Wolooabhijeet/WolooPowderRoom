package com_powderRoom_Profile;

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
import ObjectRepo.PeriodTrackerMainscreen;
import ObjectRepo.ProfileGiftCard;
import ObjectRepo.ProfilePeersClubMembership;
import ObjectRepo.ProfilePeriodTrackerDailylog;
import ObjectRepo.ProfilePeriodTrackerEditLastPeriod;
import ObjectRepo.ProfileSayitWithWoloo;
import ObjectRepo.ProfileSayitwoloosave;
import ObjectRepo.ProfileTab;
import ObjectRepo.ProfileThrustReminder;
import ObjectRepo.ProfileWolooPointsCollection;
import ObjectRepo.RateaToilet;
import ObjectRepo.RateaToiletSearch;
import ObjectRepo.RazorPay;
import ObjectRepo.RegisterationPage;
import ObjectRepo.WelcomePage;
import Utilities.BaseClass;
import Utilities.GenericUtility;
import io.appium.java_client.AppiumBy;

public class ProfileTabTest extends BaseClass {
	@Test
	public void TC_Wl_01_validateProfileImageChangeTest() throws InterruptedException {
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
		ProfileTab tab = new ProfileTab(driver);
		tab.getprofileTabClick().click();
		Assert.assertEquals(true, tab.getMenuIcon().isDisplayed());
		Assert.assertEquals(true, tab.getNameTextView().isDisplayed());
		tab.getProfileImage().click();
		tab.getImageCaptureText().click();
		tab.getShutterButton().click();
		Thread.sleep(3000);
		tab.getDoneButton().click();
		Thread.sleep(3000);

	}

	@Test
	public void TC_Wl_02_validateProfileWolooPointTest() throws InterruptedException {
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
		ProfileTab tab = new ProfileTab(driver);
		tab.getprofileTabClick().click();
		tab.getwolooPointsScreen().click();
		ProfileWolooPointsCollection points = new ProfileWolooPointsCollection(driver);
		Assert.assertEquals(true, points.getBackButton().isDisplayed());
		Assert.assertEquals(true, points.getPointsText().isDisplayed());
		Assert.assertEquals(true, points.getWolooPointsText().isDisplayed());
		Assert.assertEquals(true, points.getShopIcon().isDisplayed());
		Assert.assertEquals(true, points.getJuly2025Text().isDisplayed());
		Assert.assertEquals(true, points.getWolooStoreIcon().isDisplayed());
		Assert.assertEquals(true, points.getWolooMoneyText().isDisplayed());
		Thread.sleep(2000);

	}

	@Test
	public void TC_Wl_03_validateEditProfileTest() throws InterruptedException {
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
		ProfileTab tab = new ProfileTab(driver);
		tab.getprofileTabClick().click();
		tab.getEditIcon().click();

		RegisterationPage registerPage = new RegisterationPage(driver);

		Assert.assertEquals(true, registerPage.getNameTextfield().isDisplayed());
		Assert.assertEquals(true, registerPage.getEmailTextfield().isDisplayed());
		Assert.assertEquals(true, registerPage.getCityTextfield().isDisplayed());
		Assert.assertEquals(true, registerPage.getPincodeTextfield().isDisplayed());
		Assert.assertEquals(true, registerPage.getAddressTextfield().isDisplayed());
		Assert.assertEquals(true, registerPage.getdOBTextfield().isDisplayed());
		Assert.assertEquals(true, registerPage.getGenderTextfield().isDisplayed());
		Assert.assertEquals(true, registerPage.getSubmitButton().isDisplayed());

		registerPage.getNameTextfield().sendKeys("woloo001");
		registerPage.getEmailTextfield().sendKeys("wolooapp@gmail.com");
		registerPage.getCityTextfield().sendKeys("Bengaluru, Karanataka, India");
//	registerPage.getPincodeTextfield().sendKeys("560023");
//	registerPage.getAddressTextfield().sendKeys("No 5o , 1st main road");
//	registerPage.getdOBTextfield().sendKeys("13 Jun 2025");
//	registerPage.getGenderTextfield().sendKeys("Male");
		registerPage.getSubmitButton().click();
	}

	@Test
	public void TC_Wl_04_validatePeriodTrackerTest() throws InterruptedException {
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
		ProfileTab tab = new ProfileTab(driver);
		ProfilePeriodTrackerEditLastPeriod lastperiod = new ProfilePeriodTrackerEditLastPeriod(driver);
		tab.getprofileTabClick().click();
		tab.getPeriodManagement().click();
		lastperiod.getDatePickerHeaderDate().click();
		Thread.sleep(3000);
		String data = "2 July 2025";
		boolean dateFound = false;
		int maxAttempts = 10;
		int attempts = 0;

		while (attempts < maxAttempts) {
			try {
				WebElement ele = driver
						.findElement(AppiumBy.xpath("//android.view.View[contains(@content-desc,'" + data + "')]"));
				if (ele.isDisplayed()) {
					dateFound = true;
					ele.click();
					break;
				}
			} catch (Exception e) {
				// Click on Previous month (replace with actual element reference if needed)
				WebElement navigation = driver.findElement(AppiumBy.accessibilityId("Previous month"));
				navigation.click();
			}
			attempts++;
		}

		if (!dateFound) {
			System.out.println("Date element not found after " + maxAttempts + " attempts.");
		}
		Thread.sleep(2000);
		lastperiod.getOkButton().click();
		lastperiod.getSaveButton().click();
		Thread.sleep(2000);
	}
//
	//few work pending
	@Test
public void TC_Wl_05_validatePeriodTDailylogTest() throws InterruptedException {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getNextButton().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getMobileNumTextfield().sendKeys("8080707070");
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

		ProfileTab tab = new ProfileTab(driver);
		tab.getprofileTabClick().click();
		tab.getPeriodManagement().click();

		ProfilePeriodTrackerEditLastPeriod lastperiod = new ProfilePeriodTrackerEditLastPeriod(driver);
		ProfilePeriodTrackerDailylog logs = new ProfilePeriodTrackerDailylog(driver);
		PeriodTrackerMainscreen main = new PeriodTrackerMainscreen(driver);
		lastperiod.getSaveButton().click();
		Thread.sleep(2000);

		GenericUtility.verticalScroll(driver);

		main.getAddDailyLogButton().click();
		tab.getprofileTabClick().click();
		tab.getPeriodManagement().click();
		lastperiod.getSaveButton().click();
		logs.getScreenDescription().isDisplayed();
		logs.getScreenHeader().isDisplayed();
		logs.getViewOption1().click();
		logs.getViewOption2().click();
		logs.getViewOption3().click();
	}

	@Test
	public void TC_Wl_06_validateThrustRemainderTest() throws InterruptedException {
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
		ProfileTab tab = new ProfileTab(driver);
		tab.getprofileTabClick().click();
		tab.getThirstReminder().click();
		ProfileThrustReminder reminder = new ProfileThrustReminder(driver);

		Assert.assertEquals(true, reminder.getBackButton1().isDisplayed());
		Assert.assertEquals(true, reminder.getHeadTitleText().isDisplayed());
		Assert.assertEquals(true, reminder.getImageView2().isDisplayed());
		reminder.getYesButton().click();
		reminder.getBackButton2().isDisplayed();
		reminder.getSaveButton().click();
		reminder.getCloseDialogButton().click();
		Thread.sleep(3000);

	}

	@Test
	public void TC_Wl_07_validateSayitWolooTest() throws InterruptedException {
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
		ProfileTab tab = new ProfileTab(driver);
		tab.getprofileTabClick().click();
		tab.getSayItWithWoloo().click();
		ProfileSayitWithWoloo say = new ProfileSayitWithWoloo(driver);
		ProfileSayitwoloosave save = new ProfileSayitwoloosave(driver);
		say.getReceiverNameField().sendKeys("Viraj");
		say.getReceiverPhoneNumberField().sendKeys("9820607568");
		say.getSelectImageToSendButton().click();
		say.getImageCaptureButton().click();
		say.getShutterButton().click();
		say.getDoneButton().click();
		say.getMessageForReceiverField().sendKeys("HI woloo is here");
		say.getSaveButton().click();
		Thread.sleep(2000);
		save.getEditButton().click();
		say.getMessageForReceiverField().sendKeys("woloo is best");
		say.getSaveButton().click();
		save.getSaveButton().click();
		Thread.sleep(2000);

	}

	@Test
	public void TC_Wl_08_validateGiftCardTest() throws InterruptedException {
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
		ProfileTab tab = new ProfileTab(driver);
		ProfileGiftCard Gift = new ProfileGiftCard(driver);
		tab.getprofileTabClick().click();
		tab.getgiftCard().click();
		Gift.getBackButton().isDisplayed();
		Gift.getScreenImage().isDisplayed();
		Gift.getScreenHeader().isDisplayed();
		Gift.getScreenDescription().isDisplayed();
		Gift.getHundredOption().isDisplayed();
		Gift.getFiveHundredOption().isDisplayed();
		Gift.getThousandOption().click();
		Gift.getMobileNumberField().sendKeys("9820607568");
		Gift.getMessageField().sendKeys("woloo gift form my side");
		Gift.getSubmitButton().click();
		Thread.sleep(2000);
		RazorPay pay = new RazorPay(driver);
		pay.getUpgradeButton().click();
		// pay.getIciciBankOption().click();
		pay.getPaymentSuccessText().click();
		Thread.sleep(3000);

	}

	@Test
	public void TC_Wl_09_validatePeersClubMembershipBuy99Test() throws InterruptedException {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getNextButton().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getMobileNumTextfield().sendKeys("8080707072");
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
		ProfileTab tab = new ProfileTab(driver);
		FindaLooRenewSubscription renew = new FindaLooRenewSubscription(driver);
		ProfilePeersClubMembership Club = new ProfilePeersClubMembership(driver);
		RazorPay pay = new RazorPay(driver);
		tab.getprofileTabClick().click();
		tab.getPeersClubMembershipCheckbox().click();
		Club.getUpgradeButton().click();
		Club.getImmediateSubscriptionButton().click();
		Club.getContinueButton().click();
		Thread.sleep(3000);
		pay.getNetbankingText().click();
		Thread.sleep(1000);
		pay.getIciciBankOption().click();
		pay.getPaymentSuccessText().click();
		Thread.sleep(1000);
		pay.getCloseDialogButton().click();
		Thread.sleep(1000);
		Club.getBackButton().click();
		Thread.sleep(3000);

	}

	@Test
	public void TC_Wl_10_validatePeersClubMembershipRenew365Test() throws InterruptedException {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getNextButton().click();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.getMobileNumTextfield().sendKeys("8080707072");
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
		ProfileTab tab = new ProfileTab(driver);
		tab.getprofileTabClick().click();
		tab.getPeersClubMembershipCheckbox().click();
		FindaLooRenewSubscription renew = new FindaLooRenewSubscription(driver);
		ProfilePeersClubMembership Club = new ProfilePeersClubMembership(driver);
		RazorPay pay = new RazorPay(driver);

		renew.getRenewButton().click();
		Club.getImmediateSubscriptionButton().click();
		Club.getContinueButton().click();
		Thread.sleep(1000);
		gUtil.scrollByText("Netbanking");
	//	GenericUtility.verticalScroll(driver);

//		WebElement scroll = driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id=\"mobile-nav\"]/android.view.View[2]/android.view.View"));
//		GenericUtility.swipeAndFindElementByDirection(driver, "//android.widget.TextView[@text=\"Netbanking\"]", scroll, "up", 3);
		pay.getNetbankingText().click();                      
		Thread.sleep(1000);
		pay.getIciciBankOption().click();
		pay.getPaymentSuccessText().click();
		Thread.sleep(1000);
		pay.getCloseDialogButton().click();
		Thread.sleep(1000);
		Club.getBackButton().click();
		Thread.sleep(1000);

	}

}