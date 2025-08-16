package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BecomeaWolooHostSwipe {
	public AppiumDriver driver;

	public BecomeaWolooHostSwipe(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}// 1. First ImageView
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
	private WebElement firstImageView;

	public WebElement getFirstImageView() {
	    return firstImageView;
	}

	// 2. Screen Image
	@AndroidFindBy(id = "in.woloo.www:id/screen_image")
	private WebElement screenImage;

	public WebElement getScreenImage() {
	    return screenImage;
	}

	// 3. Screen Header
	@AndroidFindBy(id = "in.woloo.www:id/screen_header")
	private WebElement screenHeader;

	public WebElement getScreenHeader() {
	    return screenHeader;
	}

	// 4. Screen Description
	@AndroidFindBy(id = "in.woloo.www:id/screen_description")
	private WebElement screenDescription;

	public WebElement getScreenDescription() {
	    return screenDescription;
	}

	// 5. Second ImageView
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
	private WebElement secondImageView;

	public WebElement getSecondImageView() {
	    return secondImageView;
	}

	// 6. Informational Text
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Woloo offers you a great opportunity to earn extra money & also provide loads of customers if you have a Clean & Hygienic washroom facility at your outlet.\")")
	private WebElement infoText;

	public WebElement getInfoText() {
	    return infoText;
	}

	// 7. Bottom Sheet
	@AndroidFindBy(id = "in.woloo.www:id/colBottomSheet")
	private WebElement bottomSheet;

	public WebElement getBottomSheet() {
	    return bottomSheet;
	}

	// 8. Repeated ImageView
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
	private WebElement repeatedSwipe;

	public WebElement getRepeatedSwipe() {
	    return repeatedSwipe;

	}
}
