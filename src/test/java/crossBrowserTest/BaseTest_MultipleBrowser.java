package crossBrowserTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utility.Constant;

public class BaseTest_MultipleBrowser {

	WebDriver driver;

	// ctrl+Shift+O --- auto import

	
	
	
	@Parameters("br_info")
	@BeforeTest
	public void launchApp(String browser) throws Exception {

		System.out.println("launching an app on chrome browser");
		System.out.println("FETCH value from testNG XML : " + browser);
		System.out.println("FETCH value from Constant : " + Constant.browser);
		
		
		String br = browser;
		
		
		
		if(br.equalsIgnoreCase("chrome")) {
			
			System.out.println("======execution on chrome browser=======");
			driver = new ChromeDriver();
		}
		
		else if(br.equalsIgnoreCase("edge")) {
			System.out.println("execution on edge browser");
			driver = new EdgeDriver();
		}
		else if(br.equalsIgnoreCase("firefox")) {
			System.out.println("execution on firefox browser");
			driver = new FirefoxDriver();
		}
		
		else {
			
			System.out.println("===========execution on deafult browser CHROME===================");
			driver = new ChromeDriver();
		}
		
		
		
		
		
		
		
		driver.get(Constant.hrmApp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

}
