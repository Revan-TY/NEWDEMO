	package orangeHrm.qa.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

     private static  ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
		
     public static void initDriver(String browser , Boolean headless)
     {	   
    	 
	   if(browser.equalsIgnoreCase("chrome"))
	   {
		   ChromeOptions  chromeOption= new ChromeOptions();
		   
		   if(headless)
		   { 
			   chromeOption.addArguments("--headless");
		   }
		   tlDriver.set(new ChromeDriver(chromeOption));
	   }
	   
	    else if (browser.equalsIgnoreCase("firefox"))
	   {
		   tlDriver.set(new FirefoxDriver());
	   }
	   
	   getDriver().manage().window().maximize();
	// getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
       }
    
     public static WebDriver getDriver()
     {
    	 return tlDriver.get();
     }
   
   
     public static void quiteDriver()
     {
    	 getDriver().quit();
    	// tlDriver.remove();
     }
     
  
	
}
