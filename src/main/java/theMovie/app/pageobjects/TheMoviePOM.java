package theMovie.app.pageobjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TheMoviePOM {
	


	public  TheMoviePOM(AppiumDriver<AndroidElement> driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	// TheMovies first movie
	@AndroidFindBy(id="com.skydoves.themovies:id/item_poster_post")
	public AndroidElement topgun1;
	
	@AndroidFindBy(id="com.skydoves.themovies:id/detail_header_title")
	public AndroidElement Title1;
	
	@AndroidFindBy(id="com.skydoves.themovies:id/detail_header_release")
	public AndroidElement Date1;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Top Gun: Maverick']")
  	public AndroidElement Movie1;
	

}