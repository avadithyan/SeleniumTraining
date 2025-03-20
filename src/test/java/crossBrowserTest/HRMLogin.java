package crossBrowserTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Constant;

public class HRMLogin extends BaseTest_MultipleBrowser{
	
	
	
	
	
	@Test
	public void verifyLoginLogout() throws Exception {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("ogou")).click();		//partial text
		Thread.sleep(3000);
		
		
		
		
		
	}

}
