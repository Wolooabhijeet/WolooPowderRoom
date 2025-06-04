package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	public AppiumDriver driver;

	public LoginPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/ivLogo")
	private WebElement wolooLogo;
	
	@AndroidFindBy(id = "in.woloo.www:id/etEmailMobile")
	private WebElement mobileNumTextfield;
	
	@AndroidFindBy(id = "in.woloo.www:id/txtSendOtp")
	private WebElement otpButton;
	
	@AndroidFindBy(id="in.woloo.www:id/privacy_terms_text")
	private WebElement termsLink;

	public WebElement getWolooLogo() {
		return wolooLogo;
	}

	public WebElement getMobileNumTextfield() {
		return mobileNumTextfield;
	}

	public WebElement getOtpButton() {
		return otpButton;
	}

	public WebElement getTermsLink() {
		return termsLink;
	}
	
}
