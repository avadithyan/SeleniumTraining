package exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ConditionalWaitExample {
	
	
	@Test
	public void VerifyInputBoxTest() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		
		//handle sync issue
//		Thread.sleep(5000);			//hard coded delay
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='text3']")));
		
		
		driver.findElement(By.cssSelector("[id='text3']")).sendKeys("enter value");
		
		
		
	}

}
