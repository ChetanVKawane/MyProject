package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	
	public static void Screenshot(WebDriver driver, String name) throws IOException {
//		Date current=new Date();
//		String TimeStamp=current.toString().replace(" ", "-").replace(":", "-");
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\GrowwScreenshot\\"+name+".jpg"));
		
	
	}

}
