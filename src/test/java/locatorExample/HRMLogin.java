package locatorExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRMLogin {
	
	
	//ctrl+Shift+O --- auto import
	
	
	@Test
	public void verifyLoginLogout() throws Exception {
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		//Locators
		//name
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		//tagname
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		System.out.println("application URL after login:" + driver.getCurrentUrl());
		
		//classname
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		
		
		
		//LinkText
//		driver.findElement(By.linkText("Logout")).click();			//exact text
		Thread.sleep(3000);
		
		//PartialLinkText
//		driver.findElement(By.partialLinkText("ogou")).click();		//partial text
		driver.findElement(By.partialLinkText("go")).click();
//		Thread.sleep(3000);
		
		
		
		//verification/validation/assertion
		
		String actualAppURL =driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		
		System.out.println("application URL after logout:" + actualAppURL);
		Thread.sleep(3000);
		
		
		//XPATH
		driver.findElement(By.xpath("//*[@placeholder='Username']")).sendKeys("AdminXPATH");
		
		//CSS
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("ashfdakshlfjsaldf");
		
		
		
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		
		
	}

}
