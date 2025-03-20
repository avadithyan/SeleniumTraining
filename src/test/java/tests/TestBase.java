package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import utility.Constant;

public class TestBase {

	WebDriver driver;
	LoginPage lp;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get(Constant.nopAPP);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//Create Page Object
		lp = new LoginPage(driver);
		
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

}
