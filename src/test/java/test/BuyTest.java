package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import pojo.OpenBrowser;
import pom.BuyModule;
import pom.LoginPage;
import utilities.Dataset;
import utilities.Report;


public class BuyTest {
	ExtentReports rep;
	ExtentTest test;
	
	
	@BeforeClass
	public void setReports()
	{
		rep=Report.addReport();
	}
	@Parameter
	@Test(dataProvider="")
	public void buy() throws EncryptedDocumentException, IOException {
		test=rep.createTest("Login and Buy MOdule");
		WebDriver driver=OpenBrowser.openBrowser("http://www.amazon.in");
		String uname=Dataset.ExcelData(driver, "MyData", 0, 1);
		String p=Dataset.ExcelData(driver, "MyData", 1, 1);
		LoginPage lg=new LoginPage(driver);
		lg.clickSign();
		lg.userName(uname);
		lg.continueButton();
		lg.passWord(p);
		lg.signInpage();
		BuyModule bp=new BuyModule(driver);
		bp.searchProduct("iphone12");
		bp.submitButton();
		bp.selectPro();
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator<String> it=windowhandles.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		bp.clickonCart();
		
		
	}

}
