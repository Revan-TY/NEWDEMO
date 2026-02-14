package demoshop.qa.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggingTestCase {

	private static Logger log =  LogManager.getLogger(LoggingTestCase.class);

	
	@Test
	public void tc1()
	{
		log.info("this is info message");
		log.error("this is error message");
		log.debug("this is debug message");
	}
	
	
}
