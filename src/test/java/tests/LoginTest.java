package tests;

import org.testng.annotations.Test;

import utility.Constant;

public class LoginTest extends TestBase{
	
	
	@Test
	public void VerifyLogin() throws Exception {
		
		
		lp.enterUser(Constant.nop_user);
		lp.enterOnPassword("admin");
//		lp.clickOnRememberMe();
		lp.clickOnLogIn();
		
		Thread.sleep(2000);
		
		lp.clickOnLogout();
		
	}

}
