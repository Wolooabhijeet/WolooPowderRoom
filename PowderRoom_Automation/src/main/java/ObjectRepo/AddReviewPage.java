package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.GestureUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddReviewPage {

	public AppiumDriver driver;

	public AddReviewPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton;

	public WebElement getBackButton() {
	    return backButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/wah_image_display")
	private WebElement wahImageDisplay;

	public WebElement getWahImageDisplay() {
	    return wahImageDisplay;
	}

	@AndroidFindBy(id = "in.woloo.www:id/discrete_slider")
	private WebElement ratingSlider;

	public WebElement getRatingSlider() {
	    return ratingSlider;
	}

	@AndroidFindBy(id = "in.woloo.www:id/ivLovedIt")
	private WebElement lovedItEmoji;

	public WebElement getLovedItEmoji() {
	    return lovedItEmoji;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Write Your Review\")")
	private WebElement writeReviewLabel;

	public WebElement getWriteReviewLabel() {
	    return writeReviewLabel;
	}

	@AndroidFindBy(id = "in.woloo.www:id/etReview")
	private WebElement reviewTextField;

	public WebElement getReviewTextField() {
	    return reviewTextField;
	}

	@AndroidFindBy(id = "in.woloo.www:id/btnSubmit")
	private WebElement submitReviewButton;

	public WebElement getSubmitReviewButton() {
	    return submitReviewButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvOK")
	private WebElement okConfirmationButton;

	public WebElement getOkConfirmationButton() {
	    return okConfirmationButton;
	}

	
	
	
	
}
