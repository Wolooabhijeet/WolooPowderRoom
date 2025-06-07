package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CommentsPopup {
	public AppiumDriver driver;

	public CommentsPopup(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/cart_header_text")
	private WebElement commentsText;

	@AndroidFindBy(id = "in.woloo.www:id/write_review_image")
	private WebElement reviewButton;

	@AndroidFindBy(id = "in.woloo.www:id/cardViewParent")
	private WebElement commentsAreaView;

	public WebElement getCommentsText() {
		return commentsText;
	}

	public WebElement getReviewButton() {
		return reviewButton;
	}

	public WebElement getCommentsAreaView() {
		return commentsAreaView;
	}

}
