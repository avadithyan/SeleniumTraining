package controlExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleCheckBoxRadioButton extends BaseTest{
	
	
	
	@Test
	public void verifySearch() throws Exception {
		
//		driver.findElement(By.cssSelector("[type='checkbox']")).click();				//multiple match ---- 3 checkbox  ----- by default --- first element
		
		
		
		
		List<WebElement> allCheckbox =  driver.findElements(By.cssSelector("[type='checkbox']"));
		
		System.out.println("Checkbox count: " + allCheckbox.size());
		
		
//		allCheckbox.get(0).click();
//		allCheckbox.get(1).click();
		
		
		for (int i = 0; i < allCheckbox.size(); i++) {
			
			
			allCheckbox.get(i).click();
			
		}
		
		
		
		
	}
	
	

	
	

	

}
