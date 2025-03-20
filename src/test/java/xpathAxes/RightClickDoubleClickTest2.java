package xpathAxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickDoubleClickTest2 {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
//		driver.close();
//		driver.quit();
	}
	
	
	
	@Test
	public void verifyFrameElement() throws Exception {
		
		WebElement checkBox = driver.findElement(By.xpath("//*[text()='Helen Bennett']/preceding-sibling::td/input"));
		checkBox.click();		
		
		
	}
}
