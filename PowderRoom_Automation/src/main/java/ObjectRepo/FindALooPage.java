package ObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FindALooPage {
	public AppiumDriver driver;

	public FindALooPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "in.woloo.www:id/search_auto_complete")
	private WebElement searchTextfield;

	public WebElement getSearchTextfield() {
		return searchTextfield;
	}
	
}
