package handleAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HandleAlertExample2 extends BaseTest{
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("file:///C:/Users/91995/Desktop/rajesh/testData/Test.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}
	
	
	//@Test
	public void verifySimpleAlert() throws Exception {
		
		
		
		driver.findElement(By.cssSelector("[value*='Me Al']")).click();;     
		
		
		
		
		//handle an alert
		
		
		Alert SimpleAlert = driver.switchTo().alert();
		
		System.out.println("Alert Text: "+ SimpleAlert.getText());
		
		Assert.assertEquals(SimpleAlert.getText(), "Hi.. This is alert message!", "Validation get failed of Alert Text.");
		
		Thread.sleep(4000);
		
		SimpleAlert.accept();
		
		
		//accept ---- ok
		//dismiss --- cancel
		//getText 
		//Sendkeys
		
		
	}
	
	
	
	//@Test
	public void verifyConfirmAlert() throws Exception {
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Confir')]")).click();;     
		
		
		
		
		//handle an alert
		
		
		Alert confirmAlert = driver.switchTo().alert();
		
		System.out.println("Alert Text: "+ confirmAlert.getText());
		
		Assert.assertEquals(confirmAlert.getText(), "Press 'OK' or 'Cancel' button!", "Validation get failed of Alert Text.");
		
		Thread.sleep(4000);
		confirmAlert.accept();
//		confirmAlert.dismiss();
		//accept ---- ok
		//dismiss --- cancel
		//getText 
		//Sendkeys
		
		
		
		String ok_cancel_confirm = driver.findElement(By.cssSelector("#demo")).getText();  
//		Assert.assertEquals(ok_cancel_confirm,"You pressed OK!");
		System.out.println("Alert Text: "+ ok_cancel_confirm);
		
		
		Assert.assertTrue(ok_cancel_confirm.contains("OK"));
		
	}
	
	
	
	@Test
	public void verifyPromptAlert() throws Exception {
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Pro')]")).click();;     
		
		
		
		
		//handle an alert
		
		
		Alert promptAlert = driver.switchTo().alert();
		
		System.out.println("Alert Text: "+ promptAlert.getText());
		
//		SoftAssert abc = new SoftAssert();
//		abc.assertEquals(promptAlert.getText(), "Please enter your name:", "Validation get failed of Alert Text.");
		Assert.assertEquals(promptAlert.getText(), "Please enter your name:", "Validation get failed of Alert Text.");
		
		
		String name = "Anil Gupta anyname";
		
		Thread.sleep(4000);
		promptAlert.sendKeys(name);
		Thread.sleep(4000);
		
		
		promptAlert.accept();
//		confirmAlert.dismiss();
		//accept ---- ok
		//dismiss --- cancel
		//getText 
		//Sendkeys
		
		String ok_cancel_confirm = driver.findElement(By.cssSelector("#demoPrompt")).getText();  
//		Assert.assertEquals(ok_cancel_confirm,"You pressed OK!");
		System.out.println("Alert Text: "+ ok_cancel_confirm);
		
		
		Assert.assertTrue(ok_cancel_confirm.contains(name));
		
		
	}
}
