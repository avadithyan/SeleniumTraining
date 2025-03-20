package xpathAxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonSeeMore {
	
	
	WebDriver driver;

	// ctrl+Shift+O --- auto import

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
//		driver.close();
//		driver.quit();
	}
	
	
	
	@Test
	public void verifyFrameElement() throws Exception {
		
		WebElement checkBox = driver.findElement(By.xpath("//h2[contains(text(),'Amazon Brands & more')]/parent::div/parent::div/descendant::span[@class=\"a-truncate-cut\"]"));
		WebElement checkBox1 = driver.findElement(By.xpath("//h2[contains(text(),'essentials | Up to 60%')]/parent::div/parent::div/descendant::span[@class=\"a-truncate-cut\"]"));
		
		checkBox.click();		
		
		
	}
}
