package orangeHrm.qa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtil {
	
	private static FileInputStream fis; 
	private static Properties prop ;
	
	public static String getproperty(String key) throws IOException
	{
		fis = new FileInputStream("./src/main/resources/config.properties");
		prop = new Properties();
		prop.load(fis);
		fis.close();
		return prop.getProperty(key);	
	}

}
