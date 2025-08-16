package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProfileSayitWithWoloo {
	public AppiumDriver driver;

	public ProfileSayitWithWoloo(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/receiver_name\")")
	private WebElement receiverNameField;

	public WebElement getReceiverNameField() {
	    return receiverNameField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/receiver_phone_number\")")
	private WebElement receiverPhoneNumberField;

	public WebElement getReceiverPhoneNumberField() {
	    return receiverPhoneNumberField;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/select_image_to_send\")")
	private WebElement selectImageToSendButton;

	public WebElement getSelectImageToSendButton() {
	    return selectImageToSendButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"in.woloo.www:id/tvImageCapture\")")
	private WebElement imageCaptureButton;

	public WebElement getImageCaptureButton() {
	    return imageCaptureButton;
	}
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.transsion.camera:id/shutter_button\")")
	private WebElement shutterButton;

	public WebElement getShutterButton() {
	    return shutterButton;
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.transsion.camera:id/done_button\")")
	private WebElement doneButton;

	public WebElement getDoneButton() {
	    return doneButton;
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
