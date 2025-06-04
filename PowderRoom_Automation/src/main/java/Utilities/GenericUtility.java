package Utilities;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;

public class GenericUtility {
	public void screeShotMethod(AppiumDriver driver,String testName,ExtentTest test )
	{
		TakesScreenshot ts = (TakesScreenshot) UtilityClassObject.getDriver();
		String filepath = ts.getScreenshotAs(OutputType.BASE64);
		String time = new Date().toString().replace(" ", "_").replace(":", "_");

		test.addScreenCaptureFromBase64String(filepath, testName + "_" + time);
	}

}
