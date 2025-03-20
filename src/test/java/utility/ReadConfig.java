package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadConfig {

	Properties prop;
	public ReadConfig() throws Exception {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\com.deloitte.ecom\\testData\\config.properties"); //window
		FileInputStream fis1 = new FileInputStream("C:/Users/91995/eclipse-workspace/com.deloitte.ecom/testData/config.properties");      //window/non-window
		FileInputStream fis2 = new FileInputStream("./testData\\config.properties");
		

		prop = new Properties();
		
		
		prop.load(fis2);
		
		
		
		
	}
	
	
	public String getHRMAppURL() {
		
		return prop.getProperty("hrmappURL");
		
	}
	
	public String getUserName() {
		
		return prop.getProperty("username");
		
	}

	public String getPassword() {
	
	return prop.getProperty("password");
	
}

}
