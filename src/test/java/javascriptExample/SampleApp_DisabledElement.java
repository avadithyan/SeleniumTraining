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

public class SampleApp_DisabledElement {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
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
		WebElement ele_lname = driver.findElement(By.name("lname"));
		
		System.out.println("Is ele_lname is diabled: "+ ele_lname.isEnabled());
		
		
		JavascriptExecutor JS = ((JavascriptExecutor) driver);
//		JS.executeScript("arguments[0].value='enter lastName'", ele_lname);
//		JS.executeScript("arguments[0].value=arguments[1]", ele_lname, "enter lastName Value");
		
		
		
		JS.executeScript("arguments[1].value=arguments[0]","enter lastName Value from arg0", ele_lname, "enter lastName Value");
		
//		JS.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele_lname);
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
