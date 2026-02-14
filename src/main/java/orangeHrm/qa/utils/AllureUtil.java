package orangeHrm.qa.utils;

import io.qameta.allure.Allure;

public class AllureUtil {

	
	//@Attachment(value = "execution log" ,type = "text/plain")
	public static void attachlog(String log)
	{
		Allure.addAttachment(log,new String());
	}
	
}
