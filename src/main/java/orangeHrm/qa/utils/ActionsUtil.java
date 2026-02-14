package orangeHrm.qa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import orangeHrm.qa.driver.DriverFactory;

public class ActionsUtil {

	public static Actions getActions() {
		return new Actions(DriverFactory.getDriver());
	}

	public static void mouseHovering(By locater) {
		WebElement ele = WaitUtil.waitofvisibility(locater);
		getActions().moveToElement(ele).perform();

	}

	public static void doubleClick(By locater) {
		WebElement ele = WaitUtil.waitofvisibility(locater);
		getActions().doubleClick(ele).perform();
	}

	public static void rightClick(By locater) {
		WebElement ele = WaitUtil.waitofvisibility(locater);
		getActions().contextClick(ele).perform();
	}

	public static void dragAndDrop(By locater1, By locater2) {
		WebElement src = WaitUtil.waitofvisibility(locater1);
		WebElement dst = WaitUtil.waitofvisibility(locater2);
		getActions().dragAndDrop(src, dst).perform();
	}

}
