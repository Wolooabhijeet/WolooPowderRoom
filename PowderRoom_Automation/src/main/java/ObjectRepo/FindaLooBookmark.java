package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FindaLooBookmark {
	public AppiumDriver driver;

	public FindaLooBookmark(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Back\")")
	private WebElement backButton;

	public WebElement getBackButton() {
		return backButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/directionShow")
	private WebElement directionShowButton;

	public WebElement getDirectionShowButton() {
		return directionShowButton;
	}

}