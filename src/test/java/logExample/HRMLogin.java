package logExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.Constant;

public class HRMLogin extends BaseTest{
	
	

	
	
	@Test
	public void verifyLoginLogout() throws Exception {
		
		
		log.info("enter user: " + Constant.user);
		driver.findElement(By.name("username")).sendKeys(Constant.user);
		log.info("enter password: " + Constant.pass);
		driver.findElement(By.name("password")).sendKeys(Constant.pass);
		
		log.info("click on login button." );
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(3000);
		
		log.info("application URL after login:" + driver.getCurrentUrl());
		
		log.info("click on user dropdown button." );
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		Thread.sleep(3000);
		
		
		
		Thread.sleep(3000);
		log.info("click on logout" );
		driver.findElement(By.partialLinkText("Logo")).click();

		
		log.info("application URL after logout:" + driver.getCurrentUrl());
		Thread.sleep(3000);
		
		
		
		
	}

}
