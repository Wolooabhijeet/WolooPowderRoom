package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MobileNoErrorPopup {
	public AppiumDriver driver;

	public MobileNoErrorPopup(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/tv_msg")
	private WebElement errorMsgText;

	@AndroidFindBy(id = "in.woloo.www:id/btnCloseDialog")
	private WebElement closeButton;

	public WebElement getErrorMsgText() {
		return errorMsgText;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

}
