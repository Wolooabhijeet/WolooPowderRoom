package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public AppiumDriverLocalService service;
	public static AppiumDriver driver;
	public static GestureUtility gUtil;
	public Properties property;
	public FileUtility fUtil = new FileUtility();
	public ExcelUtility exUtil = new ExcelUtility();
	public MobileUtility utility;

	@BeforeSuite
	public void loadConfig() throws Exception {
		property = new Properties();
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		property.load(fis);
		String localserver = property.getProperty("appium.local.server");

		File f = new File(localserver);
		service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723)
				.withTimeout(Duration.ofSeconds(300)).build();

		service.start();
		
	}

	@Parameters("platformName")
	@BeforeClass
	public void setup(@Optional("Android") String platformName) throws Exception {
		BaseOptions<?> options;

		if (platformName.equalsIgnoreCase("Android")) {
			UiAutomator2Options androidOptions = new UiAutomator2Options();
			androidOptions.setPlatformName("Android");
			androidOptions.setDeviceName(property.getProperty("android.deviceName"));
			androidOptions.setPlatformVersion(property.getProperty("android.platformVersion"));
			androidOptions.setApp(property.getProperty("android.app.path"));
			androidOptions.setAutomationName("UiAutomator2");
			androidOptions.setAutoGrantPermissions(true);
			androidOptions.setUdid("07589311BN040005");
			options = androidOptions;
			driver = new AndroidDriver(new URL(property.getProperty("appium.server.url")), options);
			utility = new AndroidUtility(driver);

		} else {
			XCUITestOptions iosOptions = new XCUITestOptions();
			iosOptions.setPlatformName("iOS");
			iosOptions.setDeviceName(property.getProperty("ios.deviceName"));
			iosOptions.setPlatformVersion(property.getProperty("ios.platformVersion"));
			iosOptions.setApp(property.getProperty("ios.app.path"));
			iosOptions.setAutomationName("XCUITest");
			iosOptions.setAutoAcceptAlerts(true);
			options = iosOptions;
			driver = new IOSDriver(new URL(property.getProperty("appium.server.url")), options);
			utility = new IOSUtility(driver);
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		UtilityClassObject.setDriver(driver);
		gUtil = new GestureUtility(driver);

		if (!utility.isAppInstalled(fUtil.dataFromPropertiesFile("appPackage"))) {

			utility.installApp(fUtil.dataFromPropertiesFile("app"));
		}

	}
	@BeforeMethod
	public void launchApp() throws IOException
	{
		utility.activateApp(fUtil.dataFromPropertiesFile("appPackage"));
	}
	
	@AfterMethod
	public void closeApp() throws IOException
	{
		utility.closeApp(fUtil.dataFromPropertiesFile("appPackage"));
	}

	@AfterClass
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterSuite
	public void stopServer() {
		service.stop();
	}

}
