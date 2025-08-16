package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utilities.GestureUtility;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FindaLooTravelmode {

	public AppiumDriver driver;

	public FindaLooTravelmode(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	// Transport Mode Button
	@AndroidFindBy(id = "in.woloo.www:id/current_transport_mode")
	private WebElement transportModeButton;

	public WebElement getTransportModeButton() {
	    return transportModeButton;
	}

	// Bike Option Button
	@AndroidFindBy(id = "in.woloo.www:id/byBikeShow")
	private WebElement bikeOptionButton;

	public WebElement getBikeOptionButton() {
	    return bikeOptionButton;
	}

	// Search Text Field
	@AndroidFindBy(id = "in.woloo.www:id/search_auto_complete_current_location")
	private WebElement searchTextField;

	public WebElement getSearchTextField() {
	    return searchTextField;
	}
	@AndroidFindBy(id = "in.woloo.www:id/byWalkShow")
	private WebElement walkOptionButton;

	public WebElement getWalkOptionButton() {
	    return walkOptionButton;
	}





}