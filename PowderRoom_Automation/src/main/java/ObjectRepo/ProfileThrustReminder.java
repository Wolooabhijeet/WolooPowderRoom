package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileThrustReminder {
	public AppiumDriver driver;

	public ProfileThrustReminder(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton1;

	public WebElement getBackButton1() {
	    return backButton1;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/headTitleText\")")
	private WebElement headTitleText;

	public WebElement getHeadTitleText() {
	    return headTitleText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/imageView2\")")
	private WebElement imageView2;

	public WebElement getImageView2() {
	    return imageView2;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvNo\")")
	private WebElement noButton;

	public WebElement getNoButton() {
	    return noButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvYes\")")
	private WebElement yesButton;

	public WebElement getYesButton() {
	    return yesButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton2;

	public WebElement getBackButton2() {
	    return backButton2;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/etThirstFrequency\")")
	private WebElement thirstFrequencyField;

	public WebElement getThirstFrequencyField() {
	    return thirstFrequencyField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvSave\")")
	private WebElement saveButton;

	public WebElement getSaveButton() {
	    return saveButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/btnCloseDialog\")")
	private WebElement closeDialogButton;

	public WebElement getCloseDialogButton() {
	    return closeDialogButton;
	}
	
}
