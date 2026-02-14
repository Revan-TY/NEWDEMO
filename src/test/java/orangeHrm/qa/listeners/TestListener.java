package orangeHrm.qa.listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;

import orangeHrm.qa.driver.DriverFactory;
import orangeHrm.qa.utils.ScreenshotUtil;

public class TestListener implements ITestListener {

  //  @Override
    public void onTestFailure(ITestResult result) {

        ScreenshotUtil.captureScreenshot(DriverFactory.getDriver());
        System.out.println("🔥 onTestFailure triggered");

    }
}
