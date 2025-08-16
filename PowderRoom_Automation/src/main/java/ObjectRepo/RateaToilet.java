package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RateaToilet  {
	
	public AppiumDriver driver;
	
	public RateaToilet(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"in.woloo.www:id/navigation_bar_item_icon_view\"])[3]")
	private WebElement Ratetab;
	
	public WebElement getRatetabbutton() {
	    return Ratetab;
	}
	// Back button
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton;

	public WebElement getBackButton() {
	    return backButton;
	}

	// Current location search field
	@AndroidFindBy(id = "in.woloo.www:id/search_auto_complete_current_location")
	private WebElement currentLocationField;

	public WebElement getCurrentLocationField() {
	    return currentLocationField;
	}

	// WAH image display
	@AndroidFindBy(id = "in.woloo.www:id/wah_image_display")
	private WebElement wahImage;

	public WebElement getWahImage() {
	    return wahImage;
	}

	// Discrete slider
	@AndroidFindBy(id = "in.woloo.www:id/discrete_slider")
	private WebElement discreteSlider;

	public WebElement getDiscreteSlider() {
	    return discreteSlider;
	}

	// Loved it icon
	@AndroidFindBy(id = "in.woloo.www:id/ivLovedIt")
	private WebElement lovedItIcon;

	public WebElement getLovedItIcon() {
	    return lovedItIcon;
	}

	// Write review layout
	@AndroidFindBy(id = "in.woloo.www:id/write_review_layout")
	private WebElement writeReviewLayout;

	public WebElement getWriteReviewLayout() {
	    return writeReviewLayout;
	}

//	// Review input box
//	@AndroidFindBy(id = "in.woloo.www:id/etReview")
//	private WebElement reviewInput;
//
//	public WebElement getReviewInput() {
//	    return reviewInput;
//	}
	
	
	


	// Submit button
	@AndroidFindBy(id = "in.woloo.www:id/btnSubmit")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
	    return submitButton;
	}	
	
}