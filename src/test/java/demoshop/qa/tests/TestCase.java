package demoshop.qa.tests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import demoshop.qa.base.BaseTest;
import orangeHrm.qa.pages.DemoShopHome;
import orangeHrm.qa.pages.RegisterPage;
import orangeHrm.qa.utils.AllureUtil;
import orangeHrm.qa.utils.Log;


public class TestCase extends BaseTest {
	@Test  //(retryAnalyzer = orangeHrm.qa.listeners.RetryAnalyzer.class)
	public void testCase()
	{   
	    String  email= "testeng"+RandomStringUtils.randomAlphanumeric(6)+"@gmail.com" ;
	    AllureUtil.attachlog("random email  generated for test "+email);
	    DemoShopHome dp = new DemoShopHome(driver);
        Log.info("Navigating to Register page");
	    dp.clickRegister();
        Log.info("Registering user with email: ");

	    RegisterPage rp = new RegisterPage(driver);
	    rp.register("m","admin","admintest",email,"testadmin@12","testadmin@12");
	    String actualResult=rp.yourRegistrationCompleted().getText();
	    AllureUtil.attachlog("User registered successfully  for email "+email);

        Log.info("Registration result message: " + actualResult);
	    Assert.assertEquals(actualResult, "Your registration completed");
        Log.info("===== Registration Test Completed Successfully =====");

	}
}
