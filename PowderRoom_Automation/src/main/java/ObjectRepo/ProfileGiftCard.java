package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.GestureUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileGiftCard {

	public AppiumDriver driver;

	public ProfileGiftCard(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/screen_image\")")
	private WebElement screenImage;

	public WebElement getScreenImage() {
		return screenImage;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/screen_header\")")
	private WebElement screenHeader;

	public WebElement getScreenHeader() {
		return screenHeader;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/screen_description\")")
	private WebElement screenDescription;

	public WebElement getScreenDescription() {
		return screenDescription;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvHundred\")")
	private WebElement hundredOption;

	public WebElement getHundredOption() {
		return hundredOption;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvFiveHundred\")")
	private WebElement fiveHundredOption;

	public WebElement getFiveHundredOption() {
		return fiveHundredOption;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvThousand\")")
	private WebElement thousandOption;

	public WebElement getThousandOption() {
		return thousandOption;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/etAmount\")")
	private WebElement amountField;

	public WebElement getAmountField() {
		return amountField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/etMobileNumber\")")
	private WebElement mobileNumberField;

	public WebElement getMobileNumberField() {
		return mobileNumberField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/etMessage\")")
	private WebElement messageField;

	public WebElement getMessageField() {
		return messageField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvSubmit\")")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
