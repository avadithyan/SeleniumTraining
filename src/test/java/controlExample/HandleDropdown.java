package controlExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDropdown extends BaseTest{
	
	
	
//	@Test(enabled = false)
	@Test()
	public void verifyListbox1() throws Exception {
		
		
		
		WebElement countryList = driver.findElement(By.cssSelector("[name*='romL']"));
		
		Select list = new Select(countryList);
		
		
		
		System.out.println("is country list dropdown accept multiple selection: " + list.isMultiple());   //true
		
		
		
		//validation
		Assert.assertEquals(list.isMultiple(), true);
		Assert.assertTrue(list.isMultiple());
		
//		Assert.assertTrue(driver.getTitle().contains("testing"));
		
		Thread.sleep(4000);
		
		list.selectByIndex(0);   			//USA
		
		list.selectByValue("India");		//India
		
		list.selectByVisibleText("Russia");	//Russia
		
		
		Thread.sleep(4000);
		
		list.deselectAll();
		
			
		list.selectByIndex(0); 
		list.selectByIndex(1); 
		list.selectByIndex(2); 
		
		
		
		Thread.sleep(4000);
		
		list.deselectByValue("USA");		//India
		
		list.deselectByVisibleText("Russia");
		
		
		
	}

	
	
	@Test
	public void verifyListbox2() throws Exception {
		
		
		
		WebElement carList = driver.findElement(By.tagName("select"));       //multiple match ----3 ---- first
		
		Select list = new Select(carList);
		
		
		
		System.out.println("is car list dropdown accept multiple selection: " + list.isMultiple());   //false
		
		
		
		//validation
		Assert.assertEquals(list.isMultiple(), false);
		Assert.assertFalse(list.isMultiple());
		
//		Assert.assertTrue(driver.getTitle().contains("testing"));
		
		Thread.sleep(4000);
		
		list.selectByIndex(1);   			//Saab
		
		Thread.sleep(2000);
		list.selectByValue("USA");			//Volvo
		Thread.sleep(2000);
		list.selectByVisibleText("Toyota");	//Toyota
		
		
		
		
		
		
	}
}
