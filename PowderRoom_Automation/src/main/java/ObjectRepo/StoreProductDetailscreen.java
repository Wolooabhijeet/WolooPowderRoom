package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StoreProductDetailscreen {
	public AppiumDriver driver;

	public StoreProductDetailscreen(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	@AndroidFindBy(id = "in.woloo.www:id/ivBack")
	private WebElement backIcon;

	public WebElement getBackIcon() {
	    return backIcon;
	}

	@AndroidFindBy(id = "in.woloo.www:id/heart_image")
	private WebElement heartImage;

	public WebElement getHeartImage() {
	    return heartImage;
	}

	@AndroidFindBy(id = "in.woloo.www:id/product_details_image")
	private WebElement productDetailsImage;

	public WebElement getProductDetailsImage() {
	    return productDetailsImage;
	}

	@AndroidFindBy(id = "in.woloo.www:id/ivLovedIt")
	private WebElement lovedItIcon;

	public WebElement getLovedItIcon() {
	    return lovedItIcon;
	}

	@AndroidFindBy(id = "in.woloo.www:id/product_details_text")
	private WebElement productDetailsText;

	public WebElement getProductDetailsText() {
	    return productDetailsText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Description\")")
	private WebElement descriptionTab;

	public WebElement getDescriptionTab() {
	    return descriptionTab;
	}

	@AndroidFindBy(id = "in.woloo.www:id/product_details_description")
	private WebElement productDetailsDescription;

	public WebElement getProductDetailsDescription() {
	    return productDetailsDescription;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Size\")")
	private WebElement sizeTab;

	public WebElement getSizeTab() {
	    return sizeTab;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"XL\").instance(0)")
	private WebElement sizeXL;

	public WebElement getSizeXL() {
	    return sizeXL;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"10\")")
	private WebElement quantityTen;

	public WebElement getQuantityTen() {
	    return quantityTen;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"units\")")
	private WebElement unitsLabel;

	public WebElement getUnitsLabel() {
	    return unitsLabel;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"28\")")
	private WebElement quantityTwentyEight;

	public WebElement getQuantityTwentyEight() {
	    return quantityTwentyEight;
	}

	@AndroidFindBy(id = "in.woloo.www:id/change_address")
	private WebElement changeAddressButton;

	public WebElement getChangeAddressButton() {
	    return changeAddressButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Based on your recent Searches\")")
	private WebElement recentSearchesLabel;

	public WebElement getRecentSearchesLabel() {
	    return recentSearchesLabel;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Add To Cart\")")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
	    return addToCartButton;
	}


}