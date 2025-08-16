package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FindaLooEndRoute {
	public AppiumDriver driver;

	public FindaLooEndRoute(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(id = "in.woloo.www:id/back_from_enroute")
	private WebElement backFromEnroute;

	public WebElement getBackFromEnroute() {
	    return backFromEnroute;
	}

	@AndroidFindBy(id = "in.woloo.www:id/current_location_layout")
	private WebElement currentLocationLayout;

	public WebElement getCurrentLocationLayout() {
	    return currentLocationLayout;
	}

	@AndroidFindBy(id = "in.woloo.www:id/destination_location_layout")
	private WebElement destinationLocationLayout;

	public WebElement getDestinationLocationLayout() {
	    return destinationLocationLayout;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvStartNavigation")
	private WebElement startNavigationButton;

	public WebElement getStartNavigationButton() {
	    return startNavigationButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvRequiredTime")
	private WebElement requiredTimeText;

	public WebElement getRequiredTimeText() {
	    return requiredTimeText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/tvDistance")
	private WebElement distanceText;

	public WebElement getDistanceText() {
	    return distanceText;
	}



}
