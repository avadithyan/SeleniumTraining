package handleWindowExample;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleWindow_Amazon extends BaseTest{
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
//		driver.close();			//close current session
		driver.quit();			//close all the session created by driver
	}
	
	@Test
	public void verifyFrameElement() throws Exception {
		
		
		String parentWindow = driver.getWindowHandle();     //unique value
		Set<String> allWindow = driver.getWindowHandles();
		
		
		System.out.println("parentWindow: " +parentWindow);
		System.out.println("window count: " +allWindow.size());
		
		
		
		
		driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("iphone 16");
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		
		
		
		driver.findElement(By.xpath("(//span[contains(text(),'iPhone 16 128 GB: 5G Mobile Phone with Camera Control, A18 Chip and a Big Boost in Battery Life. Works with AirPods; Black')])[1]")).click();
		
		
		//driver.findElement(By.linkText("BUS")).click();;
		
		Set<String> allWindowAfter = driver.getWindowHandles();
		System.out.println("window count after click on Bus: " +allWindowAfter.size());
		
		

		Thread.sleep(5000);
		String win1 =(String)allWindowAfter.toArray()[0];
		String win2 =(String)allWindowAfter.toArray()[1];
		
		System.out.println("win1: " +win1);
		System.out.println("win2: " +win2);
		
		
		System.out.println("Before Switch to win2, app Title: " + driver.getTitle());
		
		
		
		driver.switchTo().window(win2);
		System.out.println("After Switch to win2, app Title: " + driver.getTitle());
		
		
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
		
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		System.out.println("After Switch to win2, app Title: " + driver.getTitle());
		
		
		
	}
}
