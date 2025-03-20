package takeScreenshotExample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleFrameExample {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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
	
	
	
	@Test
	public void verifyFrameElement() throws Exception {
		
		driver.findElement(By.tagName("button")).click();;
		
		Thread.sleep(2000);
		//capture screenshot
		
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		File targetFile = new File(".//screenshotFolder//HRMLogin.png");
//		FileUtils.copyFile(screenshotFile, targetFile);
		
		captureScreenshot(driver, "HRMLoginInValidUser");
		
		
		
	}
	
	
	
	
	
	public void captureScreenshot(WebDriver driver, String fName) throws Exception {
		
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		
		

		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(".//screenshotFolder//"+ fName + "_2025.png");
		FileUtils.copyFile(screenshotFile, targetFile);
		
		
	}
	
	
	
}
