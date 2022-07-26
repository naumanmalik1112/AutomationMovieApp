package theMovie.app.listeners;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	private  static ExtentReports extent;

	public  static ExtentReports createInstance() {
		
		String fileName=getReportName();
		String directory=System.getProperty("user.dir")+"./Reports/";
		new File(directory).mkdirs();
		String path=directory+fileName;
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter(path);

		htmlReporter.config().setDocumentTitle("The Movies");
		htmlReporter.config().setReportName("The Movies Testcase Report");
		htmlReporter.config().setTheme(Theme.DARK);

		extent=new ExtentReports();
		extent.setSystemInfo("OS", "Android 10");
		extent.setSystemInfo("App Name", "The Movies Testcase Report");
		extent.setSystemInfo("Environment", "Simulation");
		extent.attachReporter(htmlReporter);

		return extent;

	}
	public static String getReportName() {

		Date d=new Date();
		String fileName="AutomationReport_"+ d.toString().replace(":","_").replace(" ","_") + ".html";
		return fileName;
	}

}
