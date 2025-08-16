package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StoreAddress {
	public AppiumDriver driver;

	public StoreAddress(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	@AndroidFindBy(id = "in.woloo.www:id/back_dialog")
	private WebElement backDialogButton;

	public WebElement getBackDialogButton() {
	    return backDialogButton;
	}

	@AndroidFindBy(id = "in.woloo.www:id/cart_header_text")
	private WebElement cartHeaderText;

	public WebElement getCartHeaderText() {
	    return cartHeaderText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/cart_header_icon")
	private WebElement cartHeaderIcon;

	public WebElement getCartHeaderIcon() {
	    return cartHeaderIcon;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Select or Edit your Addresses\")")
	private WebElement selectOrEditAddressesText;

	public WebElement getSelectOrEditAddressesText() {
	    return selectOrEditAddressesText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/bottom_host_image\").instance(0)")
	private WebElement bottomHostImage0;

	public WebElement getBottomHostImage0() {
	    return bottomHostImage0;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/bottom_host_image\").instance(1)")
	private WebElement bottomHostImage1;

	public WebElement getBottomHostImage1() {
	    return bottomHostImage1;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/delete_address_button\").instance(1)")
	private WebElement deleteAddressButton1;

	public WebElement getDeleteAddressButton1() {
	    return deleteAddressButton1;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/edit_address_button\").instance(0)")
	private WebElement editAddressButton0;

	public WebElement getEditAddressButton0() {
	    return editAddressButton0;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/edit_address_button\").instance(1)")
	private WebElement editAddressButton1;

	public WebElement getEditAddressButton1() {
	    return editAddressButton1;
	}

	@AndroidFindBy(id = "in.woloo.www:id/select_address_from_list")
	private WebElement selectAddressFromList;

	public WebElement getSelectAddressFromList() {
	    return selectAddressFromList;
	}

	@AndroidFindBy(id = "in.woloo.www:id/add_new_address")
	private WebElement addNewAddressButton;

	public WebElement getAddNewAddressButton() {
	    return addNewAddressButton;
	}

	
}
