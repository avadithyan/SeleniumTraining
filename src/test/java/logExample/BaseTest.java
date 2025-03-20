package logExample;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utility.Constant;

public class BaseTest {

	WebDriver driver;
	Logger log;

	@BeforeTest
	public void launchApp() throws Exception {
		
		
		
		
		log = Logger.getLogger("HRM Application");
		PropertyConfigurator.configure(".\\testData\\log4j.properties");
		
		
		log.info("----------info-------------");
		log.warn("----------warn-------------");
		log.error("----------error-------------");
		

		log.info("launching an app on chrome browser");

		driver = new ChromeDriver();
		
		
		
		log.info("application URL: " + Constant.hrmApp);
		driver.get(Constant.hrmApp);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		log.info("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

}
