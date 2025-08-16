package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RateaToiletSearch  {
	
	public AppiumDriver driver;
	
	public RateaToiletSearch(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	
	@AndroidFindBy(id = "in.woloo.www:id/search_auto_complete_current_location")
private WebElement searchTextField;
	
	public WebElement getSearchTextField() {
	    return searchTextField;
	}
	
	
	@AndroidFindBy(id = "in.woloo.www:id/search_auto_complete")
	private WebElement Searchratetoilet;
	
	public WebElement getSearchToilet() {
	    return Searchratetoilet;
	}

	@AndroidFindBy(id = "in.woloo.www:id/search_container")
	private WebElement SearchratetoiletOption;
	
	public WebElement getSearchOption() {
	    return SearchratetoiletOption;

	}

	@AndroidFindBy(id = "in.woloo.www:id/show_cibil_score_text")
	private WebElement showCibilScoreText;

	public WebElement getShowCibilScoreText() {
	    return showCibilScoreText;
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"3.0\")")
	private WebElement ratingSlider;

	public WebElement getRatingslider() {
	    return ratingSlider;
	}

	@AndroidFindBy(id = "in.woloo.www:id/ivLovedIt")
	private WebElement lovedItIcon;

	public WebElement getLovedItIcon() {
	    return lovedItIcon;
	}
	@AndroidFindBy(id = "in.woloo.www:id/write_review_image")
	private WebElement writeReviewImage;

	public WebElement getWriteReviewImage() {
	    return writeReviewImage;
	}

	@AndroidFindBy(id = "in.woloo.www:id/etReview")
	private WebElement reviewInput;

	public WebElement getReviewInput() {
	    return reviewInput;
	}
	@AndroidFindBy(id = "in.woloo.www:id/btnSubmit")
	private WebElement submitButton;

	public WebElement getSubmitButton() {
	    return submitButton;
	}
}