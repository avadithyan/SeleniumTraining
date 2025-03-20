package actionExample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDropTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() throws Exception {

		System.out.println("launching an app on chrome browser");

		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterTest
	public void closeApp() throws Exception {

		System.out.println("Closing an app on chrome browser");
		Thread.sleep(7000);
		driver.close();
		driver.quit();
	}

	@Test
	public void verifyFrameElement() throws Exception {

		WebElement photFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		driver.switchTo().frame(photFrame);

		
		
		//drag and drop operation
		WebElement img3 = driver.findElement(By.cssSelector("[src*='tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("[src*='tatras4']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		//app1
		act.dragAndDrop(img3, trash).perform();
		
		Thread.sleep(2000);
		//app2
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		act.clickAndHold(img4).moveToElement(trash).release().perform();
		
		
		Thread.sleep(4000);
		
		
		
		
		
	}
}
