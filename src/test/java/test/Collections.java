package test;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Collections {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	Alert ar=driver.switchTo().alert();
	driver.switchTo().alert().dismiss();
	ArrayList<String> list=new ArrayList<String> ();
	list.add("chetan");
	list.add("Kaivalya");
	list.add("PArish");
	list.add("Sukumar");
	Iterator it=list.iterator();
	while(it.hasNext()) {
		
	
	System.out.println(it.next());
	}
}
}
