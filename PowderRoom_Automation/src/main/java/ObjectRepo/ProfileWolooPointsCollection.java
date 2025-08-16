package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileWolooPointsCollection {
	public AppiumDriver driver;

	public ProfileWolooPointsCollection(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvWolooPoints\")")
	private WebElement wolooPointsText;

	public WebElement getWolooPointsText() {
		return wolooPointsText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvWolooMoney\")")
	private WebElement wolooMoneyText;

	public WebElement getWolooMoneyText() {
		return wolooMoneyText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/ivShop\")")
	private WebElement shopIcon;

	public WebElement getShopIcon() {
		return shopIcon;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/ivWolooStore\").instance(0)")
	private WebElement wolooStoreIcon;

	public WebElement getWolooStoreIcon() {
		return wolooStoreIcon;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvPoints\").instance(0)")
	private WebElement pointsText;

	public WebElement getPointsText() {
		return pointsText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"July 2025\")")
	private WebElement july2025Text;

	public WebElement getJuly2025Text() {
		return july2025Text;
	}

}
