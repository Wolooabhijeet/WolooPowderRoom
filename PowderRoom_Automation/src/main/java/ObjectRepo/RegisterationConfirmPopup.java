package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterationConfirmPopup {
	public AppiumDriver driver;

	public RegisterationConfirmPopup(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(className = "android.widget.ImageView")
	private WebElement tickMarkImage;

	@AndroidFindBy(id = "in.woloo.www:id/tv_startfreetrial")
	private WebElement freeTrailText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Okay\"]")
	private WebElement okayButton;

	public WebElement getTickMarkImage() {
		return tickMarkImage;
	}

	public WebElement getFreeTrailText() {
		return freeTrailText;
	}

	public WebElement getOkayButton() {
		return okayButton;
	}

}
