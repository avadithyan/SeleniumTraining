package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleInputBox {
	
	
	//ctrl+Shift+O --- auto import
	
	
	@Test
	public void verifyInput() throws Exception {
		
		//launch chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
//		driver.findElement(By.name("fname")).sendKeys("enter Firstname");
		
		
		
		boolean isEnabledLastName = driver.findElement(By.name("lname")).isEnabled();
		System.out.println("isEnabledLastName: " + isEnabledLastName);
		
		
		
		if(isEnabledLastName) {
			
			driver.findElement(By.name("lname")).sendKeys("enter lastname");
			
		}
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		
		
	}

}
