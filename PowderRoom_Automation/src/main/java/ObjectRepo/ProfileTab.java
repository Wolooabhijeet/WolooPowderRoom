package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileTab {
	public AppiumDriver driver;

	public ProfileTab(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Profile\")")
	private WebElement profileTabClick;

	public WebElement getprofileTabClick() {
		return profileTabClick;
	}

//ImageView (Instance 0)
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
	private WebElement menuIcon;

	public WebElement getMenuIcon() {
		return menuIcon;
	}

//Profile Image
	@AndroidFindBy(id = "in.woloo.www:id/civProfileImage")
	private WebElement profileImage;

	public WebElement getProfileImage() {
		return profileImage;
	}

//Name TextView
	@AndroidFindBy(id = "in.woloo.www:id/tvName")
	private WebElement nameTextView;

	public WebElement getNameTextView() {
		return nameTextView;
	}

//Edit Icon
	@AndroidFindBy(id = "in.woloo.www:id/iv_edit")
	private WebElement editIcon;

	public WebElement getEditIcon() {
		return editIcon;
	}

//ImageView (Instance 2)
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
	private WebElement getwolooPointsScreen;

	public WebElement getwolooPointsScreen() {
		return getwolooPointsScreen;
	}

//Woloo Premium Text
	@AndroidFindBy(id = "in.woloo.www:id/tvWolooPremium")
	private WebElement wolooPremiumText;

	public WebElement getWolooPremiumText() {
		return wolooPremiumText;
	}

//Period Management
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Period \nManagement\")")
	private WebElement periodManagement;

	public WebElement getPeriodManagement() {
		return periodManagement;
	}

//Thirst Reminder
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Thirst \nReminder\")")
	private WebElement thirstReminder;

	public WebElement getThirstReminder() {
		return thirstReminder;
	}

//Say it with Woloo
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Say it with \nWoloo\")")
	private WebElement sayItWithWoloo;

	public WebElement getSayItWithWoloo() {
		return sayItWithWoloo;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.transsion.camera:id/shutter_button\")")
	private WebElement shutterButton;

	public WebElement getShutterButton() {
		return shutterButton;// click button to take a photo.
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.transsion.camera:id/done_button\")")
	private WebElement doneButton;

	public WebElement getDoneButton() {
		return doneButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvImageCapture\")")
	private WebElement imageCaptureText;

	public WebElement getImageCaptureText() {
		return imageCaptureText;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/checkboxItem\").instance(6)")
	private WebElement giftCard;

	public WebElement getgiftCard() {
		return giftCard;
	}@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/checkboxItem\").instance(3)")
	private WebElement peersClubMembershipCheckbox;

	public WebElement getPeersClubMembershipCheckbox() {
	    return peersClubMembershipCheckbox;
	}


}
