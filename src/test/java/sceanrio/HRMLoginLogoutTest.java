package sceanrio;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HRMLoginLogoutTest {
	
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		
		System.out.println("execution started.......");
		
//		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new SafariDriver();
//		WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new FirefoxDriver();
		


		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin122312423423423");
		driver.findElement(By.name("password")).sendKeys("Admin122312423423423");
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		
		
	}

}
