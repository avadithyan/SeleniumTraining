package testNGExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotationExample {
	
	//pre-condition  ----BeforeSuite ----> BeforeTest ---->BeforeClass ---->BeforeMethod

	//Test
	
	//post-condition  ----AfterSuite <---- AfterTest <----AfterClass <----AfterMethod
	
	
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("===========BeforeSuite===============");
		System.out.println("===========Configure Reports===============");
		
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("===========AfterSuite===============");
		
	}
	
	
	
	@BeforeTest
	public void launchApp() {
		System.out.println("===========launching an app===============");
		
	}
	
	@AfterTest
	public void closeApp() {
		System.out.println("===========closing an app===============");
		
	}
	
	
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("*********************BeforeClass****************************");
		
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("*********************AfterClass****************************");
		
	}
	
	
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("===========BeforeMethod===============");
		
		
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("===========AfterMethod===============");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Test
	public void login() {
		
		System.out.println("login test case");
	}
	
	
	@Test
	public void addItem() {
		
		System.out.println("addItem test case");
	}
	
	
	@Test
	public void logout() {
		
		System.out.println("logout test case");
	}

}
