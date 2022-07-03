package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	public static ExtentReports addReport() {
		ExtentSparkReporter report=new ExtentSparkReporter("AmazonReport.html");
		ExtentReports report1=new ExtentReports();
		report1.attachReporter(report);
		report1.setSystemInfo("Env", "UAT");
		report1.setSystemInfo("Testing Type","Regression");
		return report1;
		
		
	}

}
