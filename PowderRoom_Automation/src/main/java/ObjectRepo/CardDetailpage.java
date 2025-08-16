package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CardDetailpage {
	public AppiumDriver driver;

	public CardDetailpage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "in.woloo.www:id/ivBack")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"in.woloo.www:id/directions_layout\"]/android.widget.ImageView")
	private WebElement directionButton; // android.widget.LinearLayout[@resource-id="in.woloo.www:id/directions_layout"]/android.widget.ImageView

	public WebElement getDirectionButton() {
		return directionButton;
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"in.woloo.www:id/directions_layout\"]/android.widget.ImageView")
	private WebElement shareButton;

	public WebElement getShareButton() {
		return shareButton;
	}

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"in.woloo.www:id/is_like_layout\"]/android.widget.ImageView")
	private WebElement likeButton;

	public WebElement getLikeButton() {
		return likeButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvAddress")
	private WebElement addressText;

	public WebElement getAddressText() {
		return addressText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvDistance")
	private WebElement distanceText;

	public WebElement getDistanceText() {
		return distanceText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvRequiredTime")
	private WebElement requiredTimeText;

	public WebElement getRequiredTimeText() {
		return requiredTimeText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/ivPhoto")
	private WebElement photoImage;

	public WebElement getPhotoImage() {
		return photoImage;
	}

	@AndroidFindBy(id = "in.woloo.www:id/show_cibil_score_text")
	private WebElement cibilImage;

	public WebElement getCibilImage() {
		return cibilImage;
	}

	@AndroidFindBy(id = "in.woloo.www:id/btnAddReview")
	private WebElement addReviewButton;

	public WebElement getAddReviewButton() {
		return addReviewButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv2Km")
	private WebElement twoKmOption;

	public WebElement getTwoKmOption() {
		return twoKmOption;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv25Km")
	private WebElement twentyFiveKmOption;

	public WebElement getTwentyFiveKmOption() {
		return twentyFiveKmOption;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv_search_more")
	private WebElement searchMoreButton;

	public WebElement getSearchMoreButton() {
		return searchMoreButton;
	}

}