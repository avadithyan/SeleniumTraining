package ddtExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HRMLogin extends BaseTest{
	
	
	
	@Test(dataProvider = "regressiondata")
	public void verifyLoginLogout(String user, String pwd) throws Exception {
		
		
		
		
		System.out.println("user and password details are: " + user + " : " + pwd);
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		
		
		//tagname
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(5000);
		
		
		
		
		
	}
	
	
	
	@DataProvider
	public Object[][] SampleData() {
		
		Object[][] data = { {"user1", "password1"},{"user2", "3424323"},{"user3", "password3"}};
		
		return data;
		
	}
	
	
	
	@DataProvider
	public Object[][] regressiondata() {
		
		Object[][] data = { {"user_regression1", "password1"},{"user_regression2", "3424323"},{"user_regression3", "password3"},{"user_regression4", "password3"}};
		
		return data;
		
	}
	

}
