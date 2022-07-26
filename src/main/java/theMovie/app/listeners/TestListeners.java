package theMovie.app.listeners;

import java.util.Arrays;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class TestListeners implements ITestListener {

	private static ExtentReports extent=ExtentManager.createInstance();
	private static ThreadLocal<ExtentTest> extentTest=new ThreadLocal<ExtentTest>();


	public void onTestStart(ITestResult result) {

		ExtentTest test=extent.createTest(result.getMethod().getMethodName()+ ":" + "  " + "<b><font color=Gold>"+ result.getTestContext().getAttribute("DeviceName")+"</font></b>");
		extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {

		String logText=result.getMethod().getMethodName()  + ":" + "  " + result.getTestContext().getAttribute("DeviceName");
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		extentTest.get().log(Status.PASS,m);

	}

	public void onTestFailure(ITestResult result) {
		String methodName=result.getMethod().getMethodName();
		String exceptionMessage=Arrays.toString(result.getThrowable().getStackTrace());
		extentTest.get().fail("<details><summary><b><font color=red>" + "Exception Occured,Click to see details:" +
				"</font></b></summary>" +  exceptionMessage.replaceAll(",", "<br>") + "</details> \n");

		String logText= methodName  + ":" + "  " + result.getTestContext().getAttribute("DeviceName");
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.RED);
		extentTest.get().log(Status.FAIL,m);



	}

	public void onTestSkipped(ITestResult result) {

		String logText="<b>Test Method" + result.getMethod().getMethodName() + "SKipped</b>";
		Markup m=MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		extentTest.get().log(Status.SKIP,m);	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {

		if(extent !=null) {

			extent.flush();
		}

	}

}
