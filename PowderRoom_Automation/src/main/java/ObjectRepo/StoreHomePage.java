package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StoreHomePage {
	public AppiumDriver driver;

	public StoreHomePage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
	private WebElement Headerlogo;

	public WebElement Headerlogo() {
	    return Headerlogo;
	}

	@AndroidFindBy(id = "in.woloo.www:id/show_all_address")
	private WebElement showAllAddressButton;

	public WebElement getShowAllAddressButton() {
	    return showAllAddressButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/display_cart_count")
	private WebElement displayCart;

	public WebElement getDisplayCart() {
	    return displayCart;
	}

	@AndroidFindBy(id = "in.woloo.www:id/search_image")
	private WebElement searchImageButton;

	public WebElement getSearchImageButton() {
	    return searchImageButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Categories\")")
	private WebElement categoriesText;

	public WebElement getCategoriesText() {
	    return categoriesText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Wellness\")")
	private WebElement wellnessText;

	public WebElement getWellnessText() {
	    return wellnessText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Intimate Care\")")
	private WebElement intimateCareText;

	public WebElement getIntimateCareText() {
	    return intimateCareText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Home Care\")")
	private WebElement homeCareText;

	public WebElement getHomeCareText() {
	    return homeCareText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Personal Care\")")
	private WebElement personalCareText;

	public WebElement getPersonalCareText() {
	    return personalCareText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Orders\")")
	private WebElement ordersText;

	public WebElement getOrdersText() {
	    return ordersText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Favourites\")")
	private WebElement favouritesText;

	public WebElement getFavouritesText() {
	    return favouritesText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Top Brands\")")
	private WebElement topBrandsText;

	public WebElement getTopBrandsText() {
	    return topBrandsText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/see_more_brands")
	private WebElement seeMoreBrandsButton;

	public WebElement getSeeMoreBrandsButton() {
	    return seeMoreBrandsButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Collections\")")
	private WebElement collectionsText;

	public WebElement getCollectionsText() {
	    return collectionsText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/see_more_collections")
	private WebElement seeMoreCollectionsButton;

	public WebElement getSeeMoreCollectionsButton() {
	    return seeMoreCollectionsButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"New In Stores\")")
	private WebElement newInStoresText;

	public WebElement getNewInStoresText() {
	    return newInStoresText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/product_image\").instance(3)")
	private WebElement productImageInstance3;

	public WebElement getProductImageInstance3() {
	    return productImageInstance3;
	}


}
