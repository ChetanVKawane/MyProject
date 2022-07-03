package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@id=\"ap_email\"]") private WebElement username;
	@FindBy(xpath="//input[@id=\"continue\"]") private WebElement Continue;
	@FindBy(xpath="//input[@id=\"ap_password\"]")private WebElement Password;
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")private WebElement SignIN;
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]") private WebElement Clickon;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickSign() {
		Clickon.click();
	}
	
	public void userName(String user) {
		username.sendKeys(user);
	}
	
	public void continueButton() {
		Continue.click();
	}
	
	public void passWord(String pass) {
		Password.sendKeys(pass);
		
	}
	public void signInpage() {
		SignIN.click();
	}
	

}
