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

public class MyntraApp {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
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
		WebElement ele_returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'within 14days')]"));
//		WebElement ele_returnPolicy1 = driver.findElement(By.xpath("//strong[contains(text(),'within 14days')]"));
		
		JavascriptExecutor JS = ((JavascriptExecutor) driver);
		JS.executeScript("arguments[1].scrollIntoView()", "optionalValue", ele_returnPolicy);
		
		
		
	}
	
	
	
	
	
	
	
	
}
