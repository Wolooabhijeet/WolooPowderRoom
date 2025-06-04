package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OTPPage {
	public AppiumDriver driver;

	public OTPPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/ivLogo")
	private WebElement wolooLogo;

	@AndroidFindBy(id = "in.woloo.www:id/editTextOne")
	private WebElement otpTextfield1;

	@AndroidFindBy(id = "in.woloo.www:id/editTextTwo")
	private WebElement otpTextfield2;

	@AndroidFindBy(id = "in.woloo.www:id/editTextThree")
	private WebElement otpTextfield3;

	@AndroidFindBy(id = "in.woloo.www:id/editTextFour")
	private WebElement otpTextfield4;

	@AndroidFindBy(id = "in.woloo.www:id/txtProceed")
	private WebElement submitButton;

	@AndroidFindBy(id = "in.woloo.www:id/tv_resendcode")
	private WebElement resentOtpBtn;

	public WebElement getWolooLogo() {
		return wolooLogo;
	}

	public WebElement getOtpTextfield1() {
		return otpTextfield1;
	}

	public WebElement getOtpTextfield2() {
		return otpTextfield2;
	}

	public WebElement getOtpTextfield3() {
		return otpTextfield3;
	}

	public WebElement getOtpTextfield4() {
		return otpTextfield4;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getResentOtpBtn() {
		return resentOtpBtn;
	}

}
