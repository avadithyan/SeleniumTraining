package actionExample;

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

public class RightClickDoubleClickTest {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
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
		
		WebElement rightClick_btn = driver.findElement(By.xpath("//span[contains(text(),'right click')]"));
		
		WebElement Delete = driver.findElement(By.xpath("//span[contains(text(),'Dele')]"));
		
		
		//right click --- Actions  ----- contextclick()
		
		Actions act = new Actions(driver);
		
		
		//app1
//		act.contextClick(rightClick_btn).perform();
//		Delete.click();
		
		
		
		//app2
		//act.moveToElement(rightClick_btn).contextClick().perform();
		
		
		//app3
//		act.moveToElement(rightClick_btn).contextClick().click(Delete).build().perform();
		
		
		
		
		
		//app4
		act.contextClick(rightClick_btn).moveToElement(Delete).click().perform();
//		act.contextClick(rightClick_btn).click(Delete).perform();
		
		
		
		
		
		//handle an alert
		
		Thread.sleep(5000);
		
		//handle an alert
		
		System.out.println("Alert Text: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
	}
}
