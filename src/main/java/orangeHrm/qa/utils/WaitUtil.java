package orangeHrm.qa.utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import orangeHrm.qa.driver.DriverFactory;

public class WaitUtil {

	private static final int TIMEOut = 10;

	public static WebElement waitofvisibility(By locater) {
		return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOut))
				.until(ExpectedConditions.visibilityOfElementLocated(locater));
	}

	public static WebElement waitofClickable(By locater) {
		return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(TIMEOut))
				.until(ExpectedConditions.elementToBeClickable(locater));
	}
	
	
	
	
}
