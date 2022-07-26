package theMovie.app.testcases;

import theMovie.app.listeners.TestListeners;
import theMovie.app.pageobjects.*;
import theMovie.app.setup.*;
import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ TestListeners.class })
public class Themovie extends AppSetup{
    
	TheMoviePOM POM;	
	WebDriverWait wait; 	

	@Test(priority=1)
	public void CheckTitle() 
	{	
		if
			(driver.getPageSource().contains("TheMovies"))
			{
				System.out.println("Title Matched");
			}
			else {
				System.out.println("Title Mismatched");
			}
	}
		
	@Test(priority=2)
	public void ClickedonMovie1() throws InterruptedException 
	{
		POM =new TheMoviePOM(driver);
		POM.Movie1.click();
		Thread.sleep(3000);
	
	}
	
	@Test(priority=3)
	public void VerifyMovie1() throws InterruptedException
	
	{	
		String MovieName= POM.Title1.getText();
		String ExpectedName= "Top Gun: Maverick";
		System.out.print("Movie name is " + MovieName + "\n");
		
		assertEquals(MovieName, ExpectedName);
	}
	
	
	@Test(priority=4)
	public void VerifyReleaseDate1() throws InterruptedException
	{
	
		String MovieDate=POM.Date1.getText();
		String ExpectedDate= "Release Date : 2022-05-24";
		System.out.print("Movie release date is " + MovieDate + "\n");
		
		assertEquals(MovieDate, ExpectedDate);
		
		driver.navigate().back();
		Thread.sleep(3000);	
}
	
	
	@Test(priority=5)
	public void ClickedonMovie2() throws InterruptedException 
	{
		POM =new TheMoviePOM(driver);
		POM.Movie2.click();
		Thread.sleep(3000);
	
	}
		
	
	@Test(priority=5)
	public void VerifyMovie2() throws InterruptedException
	
	{	
		String MovieName= POM.Title1.getText();
		String ExpectedName= "Minions: The Rise of Gru";
		System.out.print("Movie name is " + MovieName + "\n");
		
		assertEquals(MovieName, ExpectedName);
	}

	
	
	@Test(priority=6)
	public void VerifyReleaseDate2() throws InterruptedException
	{
	
		String MovieDate=POM.Date1.getText();
		String ExpectedDate= "Release Date : 2022-06-29";
		System.out.print("Movie release date is " + MovieDate);
		
		assertEquals(MovieDate, ExpectedDate);
		
		driver.navigate().back();
		Thread.sleep(3000);	
}
}
	
	

