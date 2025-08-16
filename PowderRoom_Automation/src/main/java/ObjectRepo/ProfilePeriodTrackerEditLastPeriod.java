package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfilePeriodTrackerEditLastPeriod {
	public AppiumDriver driver;

	public ProfilePeriodTrackerEditLastPeriod(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/day_Tv\")")
	private WebElement datePickerHeaderDate;

	public WebElement getDatePickerHeaderDate() {
	    return datePickerHeaderDate;
	}

	@AndroidFindBy(accessibility = "Previous month")
	private WebElement previousMonthButton;

	public WebElement getPreviousMonthButton() {
	    return previousMonthButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button2\")")
	private WebElement cancelButton;

	public WebElement getCancelButton() {
	    return cancelButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
	private WebElement okButton;

	public WebElement getOkButton() {
	    return okButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/cycle_length_edText\")")
	private WebElement cycleLengthField;

	public WebElement getCycleLengthField() {
	    return cycleLengthField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/period_length_edText\")")
	private WebElement periodLengthField;

	public WebElement getPeriodLengthField() {
	    return periodLengthField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/save_btn\")")
	private WebElement saveButton;

	public WebElement getSaveButton() {
	    return saveButton;
	}



}
