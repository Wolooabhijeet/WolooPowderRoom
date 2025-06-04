package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ConsentPage {
	public AppiumDriver driver;

	public ConsentPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Consent\"]")
	private WebElement consentText;

	@AndroidFindBy(id = "in.woloo.www:id/consent_sign")
	private WebElement accessText;

	@AndroidFindBy(id = "in.woloo.www:id/tv_disagree_dialog")
	private WebElement denyButton;

	@AndroidFindBy(id = "in.woloo.www:id/tv_agree_dialog")
	private WebElement acceptButton;

	public WebElement getConsentText() {
		return consentText;
	}

	public WebElement getAccessText() {
		return accessText;
	}

	public WebElement getDenyButton() {
		return denyButton;
	}

	public WebElement getAcceptButton() {
		return acceptButton;
	}

}
