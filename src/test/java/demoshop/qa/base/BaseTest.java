package demoshop.qa.base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import orangeHrm.qa.driver.DriverFactory;
import orangeHrm.qa.utils.ConfigUtil;

public class BaseTest {
		
		public static WebDriver driver;
		@Parameters("browser")
		@BeforeMethod
		public void setUp(@Optional String browser) throws IOException
		{
			if(browser ==  null)
			{
				browser=ConfigUtil.getproperty("browser");
			}
			boolean headless = Boolean.parseBoolean(ConfigUtil.getproperty("headless"));

		       DriverFactory.initDriver(browser,headless);
			   driver = DriverFactory.getDriver();
			   driver.get(ConfigUtil.getproperty("test.url"));
		}
		
		@AfterMethod
		public void tearDown()
		{
			DriverFactory.quiteDriver();
		}
		
	}
	