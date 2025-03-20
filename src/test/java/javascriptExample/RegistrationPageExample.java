package javascriptExample;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationPageExample {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

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
		
		Thread.sleep(5000);
		WebElement submit = driver.findElement(By.id("submit"));
		
		
		JavascriptExecutor JS = ((JavascriptExecutor) driver);
//		JS.executeScript("alert('hello everyone, happy learning!!')");
		
		JS.executeScript("arguments[0].click()", submit);
		
		
		
	}
	
	
	
	
	
	public void captureScreenshot(WebDriver driver, String fName) throws Exception {
		
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		
		

		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(".//screenshotFolder//"+ fName + "_2025.png");
		FileUtils.copyFile(screenshotFile, targetFile);
		
		
	}
	
	
	
	public void click_JS(WebDriver driver, WebElement ele) throws Exception {
		
		
		JavascriptExecutor JS = ((JavascriptExecutor) driver);
		JS.executeScript("arguments[0].click()", ele);
		
		
	}
	
	
}
