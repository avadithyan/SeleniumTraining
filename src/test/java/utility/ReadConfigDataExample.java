package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigDataExample {

	public static void main(String[] args) throws Exception {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\91995\\eclipse-workspace\\com.deloitte.ecom\\testData\\config.properties"); //window
		FileInputStream fis1 = new FileInputStream("C:/Users/91995/eclipse-workspace/com.deloitte.ecom/testData/config.properties");      //window/non-window
		FileInputStream fis2 = new FileInputStream("./testData\\config.properties");
		

		Properties prop = new Properties();
		
		
		prop.load(fis2);
		
		
		String app = prop.getProperty("hrmappURL");
		
		System.out.println("Application URL: " + app);
		System.out.println("Application URL: " + prop.getProperty("hrmappURL"));
		System.out.println("Application username: " + prop.getProperty("username"));
		System.out.println("Application password: " + prop.getProperty("password"));
		
	}

}
