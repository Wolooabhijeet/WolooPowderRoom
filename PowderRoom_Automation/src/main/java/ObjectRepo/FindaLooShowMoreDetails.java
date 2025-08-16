package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FindaLooShowMoreDetails {

	public AppiumDriver driver;

	public FindaLooShowMoreDetails(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(id = "in.woloo.www:id/back_dialog")
	private WebElement backDialogButton;

	public WebElement getBackDialogButton() {
		return backDialogButton;
	}
	@AndroidFindBy(id = "in.woloo.www:id/tv_search_more")
	private WebElement searchMoreButton;

	public WebElement getSearchMoreButton() {
	    return searchMoreButton;
	}


	@AndroidFindBy(id = "in.woloo.www:id/cbOpenNow")
	private WebElement openNowCheckbox;

	public WebElement getOpenNowCheckbox() {
		return openNowCheckbox;
	}

	@AndroidFindBy(id = "in.woloo.www:id/cbBookmarkedWoloo")
	private WebElement bookmarkedWolooCheckbox;

	public WebElement getBookmarkedWolooCheckbox() {
		return bookmarkedWolooCheckbox;
	}

	@AndroidFindBy(id = "in.woloo.www:id/cbWolooWithOffers")
	private WebElement wolooWithOffersCheckbox;

	public WebElement getWolooWithOffersCheckbox() {
		return wolooWithOffersCheckbox;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv_4km")
	private WebElement fourKmOption;

	public WebElement getFourKmOption() {
		return fourKmOption;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv_6km")
	private WebElement sixKmOption;

	public WebElement getSixKmOption() {
		return sixKmOption;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv_all")
	private WebElement allOption;

	public WebElement getAllOption() {
		return allOption;
	}
public void showmoreUIValidation()
{
	Assert.assertEquals(true, fourKmOption.isDisplayed());
	Assert.assertEquals(true, sixKmOption.isDisplayed());
	Assert.assertEquals(true, allOption.isDisplayed());
	
}



}
