package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WelcomePage {
	public AppiumDriver driver;

	public WelcomePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "in.woloo.www:id/iv_app_logo")
	private WebElement wolooLogo;
	
	@AndroidFindBy(id="in.woloo.www:id/tv_splash_text")
	private WebElement wolooText;
	
	@AndroidFindBy(id = "in.woloo.www:id/tv_next")
	private WebElement nextButton;

	public WebElement getWolooLogo() {
		return wolooLogo;
	}

	public WebElement getWolooText() {
		return wolooText;
	}

	public WebElement getNextButton() {
		return nextButton;
	}
    
	
}
