package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Ratethankyou {

	public AppiumDriver driver;

	public Ratethankyou(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Thank you\\nfor sharing your review\")")
	private WebElement thankYouReviewText;

	public WebElement getThankYouReviewText() {
		return thankYouReviewText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv_dialogreview")
	private WebElement dialogReviewText;

	public WebElement getDialogReviewText() {
		return dialogReviewText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvOK")
	private WebElement okButton;

	public WebElement getOkButton() {
		return okButton;
	}

}