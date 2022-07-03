package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyModule {
	@FindBy(xpath="//input[@id=\"twotabsearchtextbox\"]") private WebElement SearchBar;
	@FindBy(xpath="//input[@id=\"nav-search-submit-button\"]") private WebElement Submit;
	@FindBy(xpath="//span[text()=\"Apple iPhone 12 (128GB) - Blue\"]") private WebElement Product;
	@FindBy(xpath="//input[@id=\"add-to-cart-button\"]") private WebElement CartButton;
	
	public BuyModule(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	
	public void searchProduct(String product) {
		SearchBar.sendKeys(product);
	}
	
	public void submitButton() {
		Submit.click();
	}
	 public void selectPro() {
		 Product.click();
	 }
	 
	 public void clickonCart() {
		 CartButton.click();
	 }
	
	

}
