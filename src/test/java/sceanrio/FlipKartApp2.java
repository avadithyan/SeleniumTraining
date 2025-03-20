package sceanrio;

//import org.junit.Test;




import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class FlipKartApp2 {
	
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		
		System.out.println("execution started.......");
		
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new SafariDriver();
//		WebDriver driver = new EdgeDriver();
		
//		WebDriver driver = new FirefoxDriver();
		


		
		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 15 pro" + Keys.ENTER);
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		
		
	}

}
