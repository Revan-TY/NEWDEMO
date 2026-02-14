package demoshop.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoshop.qa.base.BaseTest;
import demoshop.qa.dataprovider.ExcelDataProvider;
import orangeHrm.qa.pages.DemoShopHome;
import orangeHrm.qa.pages.RegisterPage;

public class FirstTest extends BaseTest
{

	@Test(dataProvider = "regdata" ,dataProviderClass = ExcelDataProvider.class)
	public void firstCase(String gender ,String firstname,String lastname,String email, String password,String confirmpassword)
	{   
	    DemoShopHome dp = new DemoShopHome(driver);
	    dp.clickRegister();
	    RegisterPage rp = new RegisterPage(driver);
	    rp.register(gender,firstname,lastname,email,password,confirmpassword);
	    String actualResult=rp.yourRegistrationCompleted().getText();
	    Assert.fail();
	    System.out.println(actualResult);
	    Assert.assertEquals(actualResult, "Your registration completed");
	}
	
	
	
	
	
	
	
	
}
