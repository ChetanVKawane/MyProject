package test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pojo.OpenBrowser;
import pom.LoginPage;
import utilities.Dataset;

public class LoginTest {
@Test
public void login() throws EncryptedDocumentException, IOException {
		WebDriver driver=OpenBrowser.openBrowser("http://www.amazon.in");
		String uname=Dataset.ExcelData(driver, "MyData", 0, 1);
		String p=Dataset.ExcelData(driver, "MyData", 1, 1);
		LoginPage lg=new LoginPage(driver);
		lg.clickSign();
		lg.userName(uname);
		lg.continueButton();
		lg.passWord(p);
		lg.signInpage();
		//driver.close();
	}
}


