package orangeHrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import orangeHrm.qa.utils.ActionsUtil;
import orangeHrm.qa.utils.Log;
import orangeHrm.qa.utils.WaitUtil;

public class RegisterPage {

private WebDriver driver;
	private By gMale = By.id("gender-male");
	private By gFemale = By.id("gender-female");
	private By FirstName = By.id("FirstName");
	private By LastName = By.id("LastName");
	private By Email = By.name("Email");
	private By Password = By.id("Password");
	private By ConfirmPassword = By.id("ConfirmPassword");
	private By reg = By.id("register-button");
	private By   yourRegistrationCompleted = By.xpath("//div[@class='result']");
    

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickMale()
	{
		WaitUtil.waitofvisibility(gMale).click();
	}
	public void clickFemale()
	{
		WaitUtil.waitofvisibility(gFemale).click();
	}
	public void enterFirstname(String text)
	{
		WaitUtil.waitofvisibility(FirstName).sendKeys(text);
	}
	public void enterLastName(String text)
	{
		WaitUtil.waitofvisibility(LastName).sendKeys(text);
	}
	public void enterEmail(String text)
	{
		WaitUtil.waitofvisibility(Email).sendKeys(text);
	}
	public void enterPassword(String text)
	{
		WaitUtil.waitofvisibility(Password).sendKeys(text);
	}
	
	public void enterConfirmPassword(String text)
	{
		WaitUtil.waitofvisibility(ConfirmPassword).sendKeys(text);
	}
	public void clickRegister()
	{
		WaitUtil.waitofvisibility(reg).click();
	}
	
	
	public void register(String gender ,String firstname,String lastname,String email, String password,String confirmpassword)
	{	       
		Log.info("Starting user registration");

		
		if(gender.equals("MALE"))
		{
			clickMale();
		}
		else {
			clickFemale();
		}
		enterFirstname(firstname);
		enterLastName(lastname);
		enterEmail(email);
		enterPassword(password);
		enterConfirmPassword(confirmpassword);
		clickRegister();
        Log.info("User registration form submitted");


	
	}

	public WebElement  yourRegistrationCompleted()
	{
	return  WaitUtil.waitofClickable(yourRegistrationCompleted);
			//driver.findElement(yourRegistrationCompleted);
	}
    
	
	
	
	public void mouseActionOntheperticular()
	{
		ActionsUtil.mouseHovering(FirstName);
	}
	
	
}
