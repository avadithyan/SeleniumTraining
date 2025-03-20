package exercise;

import org.testng.annotations.Test;

import utility.ReadConfig;

public class AmazonAppTest {

	
	
	@Test
	public void VerifyAppTitle() throws Exception {
		
		
		ReadConfig conf = new ReadConfig();
		
		System.out.println("Application URL: " + conf.getHRMAppURL());
		System.out.println("Application user: " + conf.getUserName());
		System.out.println("Application pass: " + conf.getPassword());
		
		
		
	}
	
	

}
