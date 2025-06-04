package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WolooPointsPopup {
	public AppiumDriver driver;

	public WolooPointsPopup(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Woloo Points!')]")
	private WebElement wolooPointsTextview;

	@AndroidFindBy(id = "in.woloo.www:id/tv_shop_now")
	private WebElement shopNowButton;

	@AndroidFindBy(id = "in.woloo.www:id/tv_go_back_to_home")
	private WebElement goBackButton;

	public WebElement getWolooPointsTextview() {
		return wolooPointsTextview;
	}

	public WebElement getShopNowButton() {
		return shopNowButton;
	}

	public WebElement getGoBackButton() {
		return goBackButton;
	}

}
