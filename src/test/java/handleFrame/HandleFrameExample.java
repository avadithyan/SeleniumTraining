package handleFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleFrameExample extends BaseTest{
	
	

	
	
	
	@Test
	public void verifyFrameElement() throws Exception {
		
		WebElement photFrame = driver.findElement(By.cssSelector("[data-src*='photo']"));
		
		//handle frame
		//index
		//name or id
		//webelement
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("name or id");
		driver.switchTo().frame(photFrame);
		
		
		
		
		
		
		String tagname = driver.findElement(By.cssSelector("[src*='tatras3']")).getTagName();     
		System.out.println("tagname ===================: " + tagname);
		
		
		
//		driver.switchTo().defaultContent();
		
		
	}
}
