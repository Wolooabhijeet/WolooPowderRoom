package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FindaLooRenewSubscription {
	public AppiumDriver driver;

	public FindaLooRenewSubscription(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	// 1. For el1 - Using className and instance(0)
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
	private WebElement profileIcon;

	public WebElement getProfileIcon() {
	    return profileIcon;
	}

	// 2. For el2 - Using ID
	@AndroidFindBy(id = "in.woloo.www:id/tv_expired")
	private WebElement expiredText;

	public WebElement getExpiredText() {
	    return expiredText;
	}

	// 3. For el3 - Using text "Renew"
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"RENEW NOW\").instance(0)")
	private WebElement renewButton;//new UiSelector().text("RENEW NOW").instance(0)

	public WebElement getRenewButton() {
	    return renewButton;
	}


}
