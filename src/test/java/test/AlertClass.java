package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement Alert=driver.findElement(By.xpath("//input[@name=\"email\"]"));
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0].value='chetankawane';",Alert);
	}
}
