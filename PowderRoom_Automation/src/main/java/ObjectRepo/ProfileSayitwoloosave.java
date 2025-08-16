package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileSayitwoloosave {
	public AppiumDriver driver;

	public ProfileSayitwoloosave(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/edit_btn\")")
	private WebElement editButton;

	public WebElement getEditButton() {
	    return editButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/message_for_receiver\")")
	private WebElement messageForReceiverField;

	public WebElement getMessageForReceiverField() {
	    return messageForReceiverField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/save_btn\")")
	private WebElement saveButton;

	public WebElement getSaveButton() {
	    return saveButton;
	}

}
