package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.Constant;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver rdriver) {
		
//		this.driver = rdriver;
		
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	//Identificaiton
	
	//By txtUser = By.cssSelector("input#Email");
	
	
	@FindBy(css = "input#Email")
	WebElement txt_User;
	
	
	@FindBy(how = How.CSS, using ="input#Email")
	WebElement txt_User1;
	
	
	
	
	
	
	
	@FindBy(how = How.CSS, using="input#Password")
	private WebElement password;
	
	
	
	public void enterOnPassword(String pwd){
		
		password.clear();
		password.sendKeys(pwd);
	}
	
	
	
	
	@FindBy(how = How.CSS, using="input#RememberMe")
	private WebElement rememberMe;
	
	
	public void clickOnRememberMe(){
		rememberMe.click();
	}
	
	
	
	@FindBy(how = How.TAG_NAME, using="button")
	private WebElement logIn;
	
	
	
	public void clickOnLogIn(){
		
		logIn.click();
	}
	
	
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using="Logo")
	private WebElement logout;
	
	
	
	public void clickOnLogout(){
		
		logout.click();
	}
	
	
	
	//methods
	
	
	public void enterUser() {
		
		txt_User.clear();
		txt_User.sendKeys("Admin");
	}
	
	public void enterUser(String user) {
		txt_User1.clear();
		txt_User.sendKeys(user);
		
		
	}
	
	public boolean isUserNameEnabled() {
		
		return txt_User.isEnabled();
	}

}
