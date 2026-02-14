package orangeHrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import orangeHrm.qa.utils.Log;
import orangeHrm.qa.utils.WaitUtil;

public class DemoShopHome {

	private WebDriver driver;
	private By register= By.xpath("//a[.='Register']");
	
	public DemoShopHome(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickRegister()
	{
		WaitUtil.waitofvisibility(register).click();
        Log.info("Clicking on Register link on Home page");

	}
	
}
