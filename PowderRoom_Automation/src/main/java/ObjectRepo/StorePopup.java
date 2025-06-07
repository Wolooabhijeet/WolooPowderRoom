package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StorePopup {
	public AppiumDriver driver;

	public StorePopup(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Store\"]")
	private WebElement storeTextview;

	@AndroidFindBy(id = "in.woloo.www:id/go_to_store")
	private WebElement storeGoButton;

	@AndroidFindBy(id = "in.woloo.www:id/go_to_services")
	private WebElement servicesGoButton;

	public WebElement getStoreTextview() {
		return storeTextview;
	}

	public WebElement getStoreGoButton() {
		return storeGoButton;
	}

	public WebElement getServicesGoButton() {
		return servicesGoButton;
	}

	public void storeGoClick()
	{
		Assert.assertEquals(true,storeTextview.isDisplayed());
		Assert.assertEquals(true,storeGoButton.isDisplayed());
		Assert.assertEquals(true,servicesGoButton.isDisplayed());
		
		storeGoButton.click();
	}
	
	public void serviceGoClick()
	{
		Assert.assertEquals(true,storeTextview.isDisplayed());
		Assert.assertEquals(true,storeGoButton.isDisplayed());
		Assert.assertEquals(true,servicesGoButton.isDisplayed());
		
		servicesGoButton.click();
	}
}
