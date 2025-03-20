package handleAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlertExample extends BaseTest{
	
	

	
	
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
		
		Assert.assertEquals(promptAlert.getText(), "Your Name Please", "Validation get failed of Alert Text.");
		
		
		
		
		Thread.sleep(4000);
		promptAlert.sendKeys("Anil Gupta");
		Thread.sleep(4000);
		
		
		promptAlert.accept();
//		confirmAlert.dismiss();
		//accept ---- ok
		//dismiss --- cancel
		//getText 
		//Sendkeys
		
		
		
		
	}
}
