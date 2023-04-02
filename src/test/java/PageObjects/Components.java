package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Components {
	
//Login
	@FindBy (xpath="//input[@placeholder=\"User Name\"]")
	private WebElement Username;
	@FindBy (xpath="//input[@placeholder=\"Password\"]")
	private WebElement Password;
	@FindBy (xpath="//button[@id=\"btnLogin\"]")
	private WebElement loginbutton;

//To exit from modify password screen
	@FindBy (xpath="//input[@value='60 Minutes later modified']")
	private WebElement exitbutton;
	
//TO click on configuration button
	@FindBy (xpath = "//a[.='Configuration']")
	private WebElement configbutton;
	
	
	public Components(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
//Login
	public void login(String username, String password) {
		Username.sendKeys(username);
		Password.sendKeys(password);
		loginbutton.click();
	}
	
//To exit from modify password screen
	public void exitFromTipsPopup() {
		exitbutton.click();
	}
	
//To click on configuration
	public void configuration() {
		configbutton.click();
	}
}
