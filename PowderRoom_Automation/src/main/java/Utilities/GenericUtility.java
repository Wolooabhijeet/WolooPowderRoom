package Utilities;

import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GenericUtility {
	public void screeShotMethod(AppiumDriver driver, String testName, ExtentTest test) {
		TakesScreenshot ts = (TakesScreenshot) UtilityClassObject.getDriver();
		String filepath = ts.getScreenshotAs(OutputType.BASE64);
		String time = new Date().toString().replace(" ", "_").replace(":", "_");

		test.addScreenCaptureFromBase64String(filepath, testName + "_" + time);
	}

	public static void verticalScroll(AppiumDriver driver) {
		int height = driver.manage().window().getSize().getHeight();
		int width = driver.manage().window().getSize().getWidth();

		int startY = (int) (height * 0.7);
		int endY = (int) (height * 0.3);
		int centerX = width / 2;

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);

		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), centerX, startY));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(
				finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), centerX, endY));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(swipe));
	}

	public static void tapUsingCoordinatePercentage(AppiumDriver driver, WebElement layout, double xPercent,
			double yPercent) {

		Point location = layout.getLocation();
		Dimension size = layout.getSize();

		int x = (int) ((xPercent / 100) * size.getWidth() + location.getX());
		int y = (int) ((yPercent / 100) * size.getHeight() + location.getY());

		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap = new Sequence(finger, 1);

		tap.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), x, y));
		tap.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		tap.addAction(new Pause(finger, Duration.ofMillis(50)));
		tap.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(tap));
	}

	public static boolean swipeAndFindElementByDirection(AppiumDriver driver, String xpath, WebElement container,
			String direction, int maxSwipes) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); // short wait
		boolean expected = false;

		for (int i = 0; i < maxSwipes; i++) {
			try {
				List<WebElement> elements = driver.findElements(AppiumBy.xpath(xpath));
				if (!elements.isEmpty() && elements.get(0).isDisplayed()) {

					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // reset wait
					expected = true;
					break;
				} else {

					swipeInDirection(driver, container, direction);
				}
			} catch (Exception e) {
				System.out.println(" Unexpected exception: " + e.getMessage());
				swipeInDirection(driver, container, direction);
			}
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // reset wait
		return expected;
	}

	public static void swipeInDirection(AppiumDriver driver, WebElement container, String direction) {
		// Validate container
		if (container == null || container.getSize().getWidth() == 0 || container.getSize().getHeight() == 0) {
			throw new IllegalArgumentException(" Swipe container is null or has zero size.");
		}

		int width = container.getSize().getWidth();
		int height = container.getSize().getHeight();
		int startX = container.getLocation().getX();
		int startY = container.getLocation().getY();

		int fromX, toX, fromY, toY;

		switch (direction.toLowerCase()) {
		case "up": // Bottom to top
			fromX = startX + width / 2;
			toX = fromX;
			fromY = startY + (int) (height * 0.8);
			toY = startY + (int) (height * 0.2);
			break;
		case "down": // Top to bottom
			fromX = startX + width / 2;
			toX = fromX;
			fromY = startY + (int) (height * 0.2);
			toY = startY + (int) (height * 0.8);
			break;
		case "left": // Right to left
			fromY = startY + height / 2;
			toY = fromY;
			fromX = startX + (int) (width * 0.8);
			toX = startX + (int) (width * 0.2);
			break;
		case "right": // Left to right
			fromY = startY + height / 2;
			toY = fromY;
			fromX = startX + (int) (width * 0.2);
			toX = startX + (int) (width * 0.8);
			break;
		default:
			throw new IllegalArgumentException("❌ Unsupported swipe direction: " + direction);
		}

		// Perform swipe using W3C actions
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);

		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), fromX, fromY));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), toX, toY));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		driver.perform(Collections.singletonList(swipe));
	}

}
