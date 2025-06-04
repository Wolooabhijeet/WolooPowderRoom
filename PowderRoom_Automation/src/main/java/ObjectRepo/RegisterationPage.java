package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterationPage {
	public AppiumDriver driver;

	public RegisterationPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/etName")
	private WebElement nameTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/etEmail")
	private WebElement emailTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/etMobile")
	private WebElement mobNumTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/etCity")
	private WebElement cityTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/etPincode")
	private WebElement pincodeTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/etAddress")
	private WebElement addressTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/etDob")
	private WebElement dOBTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/etGender")
	private WebElement genderTextfield;

	@AndroidFindBy(id = "in.woloo.www:id/btnNext")
	private WebElement submitButton;

	public WebElement getNameTextfield() {
		return nameTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getMobNumTextfield() {
		return mobNumTextfield;
	}

	public WebElement getCityTextfield() {
		return cityTextfield;
	}

	public WebElement getPincodeTextfield() {
		return pincodeTextfield;
	}

	public WebElement getAddressTextfield() {
		return addressTextfield;
	}

	public WebElement getdOBTextfield() {
		return dOBTextfield;
	}

	public WebElement getGenderTextfield() {
		return genderTextfield;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

}
