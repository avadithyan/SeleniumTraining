package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Constant;

public class LoginPage_WithoutPagefactory {

	WebDriver driver;
	
	public LoginPage_WithoutPagefactory(WebDriver rdriver) {
		
//		this.driver = rdriver;
		
		driver = rdriver;
		
	}
	
	
	
	//Identificaiton
	
	By txtUser = By.cssSelector("input#Email");
	
	
	
	
	
	
	//methods
	
	
	public void enterUser() {
		
		driver.findElement(txtUser).clear();
		driver.findElement(txtUser).sendKeys("Admin");
	}
	
	public void enterUser(String user) {
		driver.findElement(txtUser).clear();
		driver.findElement(txtUser).sendKeys(user);
		
		
	}
	
	public boolean isUserNameEnabled() {
		
		return driver.findElement(txtUser).isEnabled();
	}

}
