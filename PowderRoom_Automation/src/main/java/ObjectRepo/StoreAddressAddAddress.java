package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StoreAddressAddAddress {
	public AppiumDriver driver;

	public StoreAddressAddAddress(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
	}
	@AndroidFindBy(id = "in.woloo.www:id/cart_header_text")
	private WebElement cartHeaderText;

	public WebElement getCartHeaderText() {
	    return cartHeaderText;
	}

	@AndroidFindBy(id = "in.woloo.www:id/first_name_addresser")
	private WebElement firstNameAddresser;

	public WebElement getFirstNameAddresser() {
	    return firstNameAddresser;
	}

	@AndroidFindBy(id = "in.woloo.www:id/last_name_addresser")
	private WebElement lastNameAddresser;

	public WebElement getLastNameAddresser() {
	    return lastNameAddresser;
	}

	@AndroidFindBy(id = "in.woloo.www:id/flat_num")
	private WebElement flatNum;

	public WebElement getFlatNum() {
	    return flatNum;
	}

	@AndroidFindBy(id = "in.woloo.www:id/locality")
	private WebElement locality;

	public WebElement getLocality() {
	    return locality;
	}

	@AndroidFindBy(id = "in.woloo.www:id/apartment_road_area")
	private WebElement apartmentRoadArea;

	public WebElement getApartmentRoadArea() {
	    return apartmentRoadArea;
	}

	@AndroidFindBy(id = "in.woloo.www:id/city_addresser")
	private WebElement cityAddresser;

	public WebElement getCityAddresser() {
	    return cityAddresser;
	}

	@AndroidFindBy(id = "in.woloo.www:id/state_addresser")
	private WebElement stateAddresser;

	public WebElement getStateAddresser() {
	    return stateAddresser;
	}

	@AndroidFindBy(id = "in.woloo.www:id/pincode_address")
	private WebElement pincodeAddress;

	public WebElement getPincodeAddress() {
	    return pincodeAddress;
	}

	@AndroidFindBy(id = "in.woloo.www:id/phone_addresser")
	private WebElement phoneAddresser;

	public WebElement getPhoneAddresser() {
	    return phoneAddresser;
	}

	@AndroidFindBy(id = "in.woloo.www:id/address_name")
	private WebElement addressName;

	public WebElement getAddressName() {
	    return addressName;
	}

	@AndroidFindBy(id = "in.woloo.www:id/default_address_image")
	private WebElement defaultAddressImage;

	public WebElement getDefaultAddressImage() {
	    return defaultAddressImage;
	}

	@AndroidFindBy(id = "in.woloo.www:id/add_address_button")
	private WebElement addAddressButton;

	public WebElement getAddAddressButton() {
	    return addAddressButton;
	}


}
