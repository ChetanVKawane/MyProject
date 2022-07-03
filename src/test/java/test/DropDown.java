package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//WebElement options=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		//Select sec=new Select(options);
		//List<WebElement> opt = sec.getOptions();
		List<WebElement>all=driver.findElements(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		for(WebElement one: all) {
			if(one.getText().contains("Beauty"));
			one.click();
			
		}
	}
	

}
