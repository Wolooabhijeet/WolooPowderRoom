package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PeriodTrackerMainscreen {
	public AppiumDriver driver;

	public PeriodTrackerMainscreen(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvPeriodInformation\")")
	private WebElement periodInformation;

	public WebElement getPeriodInformation() {
		return periodInformation;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/show_info_dialog\")")
	private WebElement showInfoDialog;

	public WebElement getShowInfoDialog() {
		return showInfoDialog;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Know more about your \\nMenstruation Cycle\")")
	private WebElement knowMoreAboutCycle;

	public WebElement getKnowMoreAboutCycle() {
		return knowMoreAboutCycle;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Menstruation Cycle\")")
	private WebElement menstruationCycle;

	public WebElement getMenstruationCycle() {
		return menstruationCycle;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"The average menstrual cycle lasts about 28 days\")")
	private WebElement menstruationInfoText;

	public WebElement getMenstruationInfoText() {
		return menstruationInfoText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Pregnancy Cycle\")")
	private WebElement pregnancyCycle;

	public WebElement getPregnancyCycle() {
		return pregnancyCycle;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Ovulation typically occurs\")")
	private WebElement ovulationInfoText;

	public WebElement getOvulationInfoText() {
		return ovulationInfoText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Ovulation Cycle\")")
	private WebElement ovulationCycle;

	public WebElement getOvulationCycle() {
		return ovulationCycle;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().textContains(\"Understanding Your Pregnancy Cycle\")")
	private WebElement pregnancyInfoText;

	public WebElement getPregnancyInfoText() {
		return pregnancyInfoText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/btnGoIt\")")
	private WebElement gotItButton;

	public WebElement getGotItButton() {
		return gotItButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/add_daily_log_Imv\")")
	private WebElement addDailyLogButton;

	public WebElement getAddDailyLogButton() {
		return addDailyLogButton;
	}

}