package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePeersClubMembership {
	public AppiumDriver driver;

	public ProfilePeersClubMembership(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	// 1. Back Button (Text: "Back")
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton;

	public WebElement getBackButton() {
	    return backButton;
	}

	// 2. Screen Header (ID: in.woloo.www:id/screen_header)
	@AndroidFindBy(id = "in.woloo.www:id/screen_header")
	private WebElement screenHeader;

	public WebElement getScreenHeader() {
	    return screenHeader;
	}

	// 3. "MONTHLY" Button (Text)
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"MONTHLY\")")
	private WebElement monthlyButton;

	public WebElement getMonthlyButton() {
	    return monthlyButton;
	}

	// 4. "ANNUAL" Button (Text)
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"ANNUAL\")")
	private WebElement annualButton;

	public WebElement getAnnualButton() {
	    return annualButton;
	}

	// 5. Upgrade Button (resourceId with instance(0))
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tv_upgrade\").instance(0)")
	private WebElement upgradeButton;

	public WebElement getUpgradeButton() {
	    return upgradeButton;
	}

	// 6. Renew Now Button (resourceId with instance(0))
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/renew_now\").instance(0)")
	private WebElement renewNowButton;

	public WebElement getRenewNowButton() {
	    return renewNowButton;
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/btn_pay\")")
	private WebElement payButton;

	public WebElement getPayButton() {
	    return payButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/btn_pay\")")
	private WebElement payUIButton;

	public WebElement getPayUIButton() {
	    return payUIButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Image\").instance(29)")
	private WebElement bankLogoImage;

	public WebElement getBankLogoImage() {
	    return bankLogoImage;
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/futureSubscriptionBtn\")")
	private WebElement futureSubscriptionButton;

	public WebElement getFutureSubscriptionButton() {
	    return futureSubscriptionButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/immediateSubscriptionBtn\")")
	private WebElement immediateSubscriptionButton;

	public WebElement getImmediateSubscriptionButton() {
	    return immediateSubscriptionButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/llCancelBtn\")")
	private WebElement cancelButton;

	public WebElement getCancelButton() {
	    return cancelButton;
	}@AndroidFindBy(uiAutomator = "new UiSelector().text(\"CONTINUE\")")
	private WebElement continueButton;

	public WebElement getContinueButton() {
	    return continueButton;
	}


	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/radio_gift\")")
	private WebElement giftRadioButton;

	public WebElement getGiftRadioButton() {
	    return giftRadioButton;
	}

}