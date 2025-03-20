package testNGExample;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest_EnableDepend {
	
	
	
	@BeforeTest
	public void launchApp() {
		System.out.println("===========launching an app===============");
		
	}
	
	@AfterTest
	public void closeApp() {
		System.out.println("===========closing an app===============");
		
	}
	
	@Test(priority = -100, description = "userStory: Amazon app Login test")
	public void login() {
		
		System.out.println("login test case");
		Assert.assertTrue(false);
		
	}
	
	

	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	

	@Test(dependsOnMethods = "login")
	public void addItems() {
		
		System.out.println("addItems test case");
		
	}
	

	

}
