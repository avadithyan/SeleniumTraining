package sceanrio;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleApp {
	
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		
		System.out.println("execution started.......");
		
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new SafariDriver();
//		WebDriver driver = new EdgeDriver();
		
//		WebDriver driver = new FirefoxDriver();
		


		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("fname")).sendKeys("enter firstName");
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		
		
	}

}
