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
	@AndroidFindBy(id="com.skydoves.themovies:id/item_poster_post") // POM ID for Movie TopGun
	public AndroidElement topgun1;
	
	@AndroidFindBy(id="com.skydoves.themovies:id/detail_header_title") // POM ID for App Title
	public AndroidElement Title1;
	
	@AndroidFindBy(id="com.skydoves.themovies:id/detail_header_release") // POM ID for release date
	public AndroidElement Date1;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Top Gun: Maverick']") // POM Xpath for Movie1
  	public AndroidElement Movie1;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Minions: The Rise of Gru']") // POM Xpath for Movie2 
  	public AndroidElement Movie2;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Doctor Strange in the Multiverse of Madness']") // POM Xpath for Movie3
  	public AndroidElement Movie3;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Jurassic World Dominion']") // POM XPath for Movie4
  	public AndroidElement Movie4;
	
	@AndroidFindBy(id="com.skydoves.themovies:id/detail_header_star") // POM ID for Ratings 
	public AndroidElement Rating;
	
}