package testNGExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest_Priority {
	
	
	
	//priority
	//highest negative number having highest priority 
	//by default priority --- 0
	//if priority is same execution as per naming conv
	
	
	//-----login (-100)---- addItems (0) -------cancelOrder/updateOdrer(1) ------- payment(2) -------logout(4)
	
	
	
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
		
	}
	
	

	@Test(priority = 4)
	public void logout() {
		
		System.out.println("logout test case");
		
	}
	
	

	@Test
	public void addItems() {
		
		System.out.println("addItems test case");
		
	}
	

	@Test(priority = 1)
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		
	}
	
	

	@Test(priority = 1)
	public void updateorder() {
		
		System.out.println("updateorder test case");
		
	}
	
	

	@Test(priority = 2)
	public void payment() {
		
		System.out.println("payment test case");
		
	}

}
