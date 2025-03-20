package exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static utility.Constant.*;

public class AccessDataFromContant {
	
	
	@Test
	public void VerifyInputBoxTest() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		System.out.println("Fetch value from Contant: " + sampleApp);
		driver.get(sampleApp);
		
		
		
		
		driver.manage().window().maximize();
		
		
		
		
		
	}

}
