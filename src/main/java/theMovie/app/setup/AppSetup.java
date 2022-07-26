package theMovie.app.setup;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class AppSetup  {
	
	public static AndroidDriver<AndroidElement> driver;

	@Parameters({"platform", "udid","device", "systemPort"})
	
	@BeforeTest
	
	
	public void setup( String platform, String udid, String device, String systemPort)  throws MalformedURLException, InterruptedException
	{
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", platform);
		desiredCapabilities.setCapability("deviceName",device);
		desiredCapabilities.setCapability("udid", udid);
		desiredCapabilities.setCapability("autoGrantPermissions",true);
		desiredCapabilities.setCapability("newCommandTimeout","90");
		desiredCapabilities.setCapability("appPackage", "com.skydoves.themovies");
		desiredCapabilities.setCapability("appActivity", "com.skydoves.themovies.view.ui.main.MainActivity");
		

		 URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<AndroidElement>(url,desiredCapabilities);
		 
	
}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	//	driver.closeApp();

	}
}
