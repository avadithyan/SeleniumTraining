package handleWindowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleFrameExample extends BaseTest{
	
	
	
	@Test
	public void verifyFrameElement() throws Exception {
		
		
		String parentWindow = driver.getWindowHandle();     //unique value
		Set<String> allWindow = driver.getWindowHandles();
		
		
		System.out.println("parentWindow: " +parentWindow);
		System.out.println("window count: " +allWindow.size());
		
		
		
		driver.findElement(By.linkText("BUS")).click();;
		
		Set<String> allWindowAfter = driver.getWindowHandles();
		System.out.println("window count after click on Bus: " +allWindowAfter.size());
		
		
//		driver.switchTo().window("");
		
		
	}
}
