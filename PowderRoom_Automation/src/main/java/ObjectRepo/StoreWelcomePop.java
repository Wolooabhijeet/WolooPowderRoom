package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StoreWelcomePop {
	public AppiumDriver driver;

	public StoreWelcomePop(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Store\")")
	private WebElement storeButton;

	public WebElement getStoreButton() {
	    return storeButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/go_to_store")
	private WebElement goToStoreButton;

	public WebElement getGoToStoreButton() {
	    return goToStoreButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/go_to_services")
	private WebElement goToServicesButton;

	public WebElement getGoToServicesButton() {
	    return goToServicesButton;
	}

	

	
	
}
