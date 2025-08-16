package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RazorPay {

	public AppiumDriver driver;

	public RazorPay(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tv_upgrade\").instance(0)")
	private WebElement upgradeButton;

	public WebElement getUpgradeButton() {
		return upgradeButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"ICICI ICICI\")")
	private WebElement iciciBankOption;

	public WebElement getIciciBankOption() {
	    return iciciBankOption;
	

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/btnCloseDialog\")")
	private WebElement closeDialogButton;

	public WebElement getCloseDialogButton() {
		return closeDialogButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Success\")")
	private WebElement paymentSuccessText;

	public WebElement getPaymentSuccessText() {
		return paymentSuccessText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Bank of Baroda - Retail Banking Netbanking\")")
	private WebElement bankOfBarodaNetbankingOption;

	public WebElement getBankOfBarodaNetbankingOption() {
		return bankOfBarodaNetbankingOption;
	}
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Netbanking\"]")
	private WebElement netbankingText;

	public WebElement getNetbankingText() {
	    return netbankingText;
	}
	@AndroidFindBy(xpath = "//android.webkit.WebView")
	private WebElement webViewElement;

	public WebElement getWebViewElement() {
	    return webViewElement;
	}


	

	

}
