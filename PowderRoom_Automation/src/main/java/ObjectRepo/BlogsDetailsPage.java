package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.GestureUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BlogsDetailsPage {

	public AppiumDriver driver;

	public BlogsDetailsPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/ivBack")
	private WebElement backButton;

	@AndroidFindBy(id = "in.woloo.www:id/woloo_powderroom_icon")
	private WebElement wolooLogo;

	@AndroidFindBy(id = "in.woloo.www:id/blog_name")
	private WebElement blogText;

	@AndroidFindBy(id = "in.woloo.www:id/shop_now")
	private WebElement shopnowButton;

	@AndroidFindBy(id = "in.woloo.www:id/heartimg")
	private WebElement heartImage;

	@AndroidFindBy(id = "in.woloo.www:id/commentimg")
	private WebElement commentsImage;

	@AndroidFindBy(id = "in.woloo.www:id/shareimg")
	private WebElement shareImage;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"10\"]")
	private WebElement pointsText;

	@AndroidFindBy(id = "in.woloo.www:id/exo_play_pause")
	private WebElement playButton;

	@AndroidFindBy(id = "in.woloo.www:id/imageView")
	private WebElement normImageview;

	@AndroidFindBy(id = "in.woloo.www:id/exo_controls_background")
	private WebElement videoView;

	public WebElement getBackButton() {
		return backButton;
	}

	public WebElement getWolooLogo() {
		return wolooLogo;
	}

	public WebElement getBlogText() {
		return blogText;
	}

	public WebElement getShopnowButton() {
		return shopnowButton;
	}

	public WebElement getHeartImage() {
		return heartImage;
	}

	public WebElement getCommentsImage() {
		return commentsImage;
	}

	public WebElement getShareImage() {
		return shareImage;
	}

	public WebElement getPointsText() {
		return pointsText;
	}

	public WebElement getPlayButton() {
		return playButton;
	}

	public WebElement getNormImageview() {
		return normImageview;
	}

	public WebElement getVideoView() {
		return videoView;
	}

	public void verifyBlogsDetailsScreenUI() {
		Assert.assertEquals(true, backButton.isDisplayed());
		Assert.assertEquals(true, wolooLogo.isDisplayed());
		Assert.assertEquals(true, blogText.isDisplayed());
		Assert.assertEquals(true, shopnowButton.isDisplayed());
		Assert.assertEquals(true, heartImage.isDisplayed());
		Assert.assertEquals(true, commentsImage.isDisplayed());
		Assert.assertEquals(true, shareImage.isDisplayed());
		Assert.assertEquals(true, pointsText.isDisplayed());
	}

	public void verifyVideoPlayfunctionality() {
		try {
			if (videoView.isDisplayed()) {
				playButton.click();
			}
		} catch (Exception e) {
			System.out.println("There is no playButton" + e.getMessage());
		}
	}

	public void verifyImagefunctionality() throws InterruptedException {
		try {
			if (!videoView.isDisplayed()) {
				GestureUtility utility = new GestureUtility(driver);
				utility.scrollOnElement(normImageview, "left");
				Thread.sleep(1000);
				utility.scrollOnElement(normImageview, "right");
			}
		} catch (Exception e) {
			System.out.println("There is no playButton" + e.getMessage());
		}

	}

}
