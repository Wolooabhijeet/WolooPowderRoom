package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePeriodTrackerDailylog {
	public AppiumDriver driver;

	public ProfilePeriodTrackerDailylog(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
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

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(3)")
	private WebElement viewOption1;

	public WebElement getViewOption1() {
		return viewOption1;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(11)")
	private WebElement viewOption2;

	public WebElement getViewOption2() {
		return viewOption2;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(13)")
	private WebElement viewOption3;

	public WebElement getViewOption3() {
		return viewOption3;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/dailyLogSave\")")
	private WebElement dailyLogSaveButton;

	public WebElement getDailyLogSaveButton() {
		return dailyLogSaveButton;
	}

}