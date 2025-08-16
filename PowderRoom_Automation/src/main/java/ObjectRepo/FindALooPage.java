package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FindALooPage {
	public AppiumDriver driver;

	public FindALooPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/search_auto_complete")
	private WebElement searchTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/imgScanQR")
	private WebElement barCodeImage;

	@AndroidFindBy(id = "in.woloo.www:id/show_bookmark_list")
	private WebElement bookmarkListImg;

	@AndroidFindBy(id = "in.woloo.www:id/contact_us")
	private WebElement contactUsButton;

	@AndroidFindBy(id = "in.woloo.www:id/current_location_button")
	private WebElement currentLocationButton;

	@AndroidFindBy(className = "android.view.View")
	private WebElement genericViewElement;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/cardViewParent\").instance(0)")
	private WebElement Loocard;

	public WebElement getSearchTextfield() {
		return searchTextfield;
	}

	public WebElement getBarCodeImage() {
		return barCodeImage;
	}

	public WebElement getBookmarkListImg() {
		return bookmarkListImg;
	}

	public WebElement getContactUsButton() {
		return contactUsButton;
	}

	public WebElement getCurrentLocationButton() {
		return currentLocationButton;
	}

	public WebElement getGenericViewElement() {
		return genericViewElement;
	}

	public WebElement getLoocard() {
		return Loocard;
	}
	@AndroidFindBy(className = "android.widget.LinearLayout")
	private WebElement noInternetPopup;

	public WebElement getNoInternetPopup() {
	    return noInternetPopup;
	}

}
