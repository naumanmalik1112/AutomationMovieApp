package theMovie.app.testcases;

import theMovie.app.listeners.TestListeners;
import theMovie.app.pageobjects.*;
import theMovie.app.setup.*;
import static org.testng.Assert.*;
import static org.testng.Assert.assertEquals;
import java.util.Arrays;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({ TestListeners.class })
public class Themovie extends AppSetup{
    
	TheMoviePOM POM;	// Initilaize POM
	WebDriverWait wait; // Initialize Wait
	String[] Ratings = new String[4]; // Initialize Array for Sorting

	@Test(priority=1) // Test case priority, this will get the App Title and match with the actual App title
	public void CheckTitle() throws InterruptedException 
	{	
		if
			(driver.getPageSource().contains("TheMovies")) // Verify if the title contains TheMovies
			{
				System.out.println("Title Matched");
			}
			else {
				System.out.println("Title Mismatched"); // If the title is not matched, display this error output
			}
			Thread.sleep(3000); // wait for 3 seconds
	}
		
	@Test(priority=2) // Test case 2, will click on the movie 
	public void ClickedonMovie1() throws InterruptedException 
	{
		POM =new TheMoviePOM(driver);
		POM.Movie1.click(); // This will click the movie with the name available in POM
		Thread.sleep(3000);
	
	}
	
	@Test(priority=3) // This Test case will route the user to the deatils page of the selected movie and verify the name and Rating
	public void VerifyMovie1() throws InterruptedException
	
	{	
		String MovieName= POM.Title1.getText(); // this will get the movie title
		String ExpectedName= "Top Gun: Maverick"; // Expected movie Title
		System.out.print("Movie name is " + MovieName + "\n");
		
		assertEquals(MovieName, ExpectedName); // This assert will verify the actual movie name with app movie name
		
		String Rating1= POM.Rating.getText(); // Get the movie ratings
		System.out.print("Movie Rating is " + Rating1 + "\n"); // display the movie ratings
		Ratings[0] = POM.Rating.getText(); // add the rating to the array for sorting
		
	}
	
	
	@Test(priority=4) // verify release date of the movie
	public void VerifyReleaseDate1() throws InterruptedException
	{
	
		String MovieDate=POM.Date1.getText(); // get release date
		String ExpectedDate= "Release Date : 2022-05-24"; // expected release date
		System.out.print("Movie release date is " + MovieDate + "\n"); // display release date
		
		assertEquals(MovieDate, ExpectedDate); // verify release date
		
		driver.navigate().back(); // go back to the previous page
		Thread.sleep(3000);	// wait 3 seconds
}
	
	
	@Test(priority=5) // click on movie at the second place
	public void ClickedonMovie2() throws InterruptedException 
	{
		POM =new TheMoviePOM(driver);
		POM.Movie2.click(); // click on movie at the second place 
		Thread.sleep(3000); // wait 3 seconds
	
	}
		
	
	@Test(priority=6) // Verify the name and get ratings
	public void VerifyMovie2() throws InterruptedException
	
	{	
		String MovieName= POM.Title1.getText(); // get movie title
		String ExpectedName= "Minions: The Rise of Gru"; // expected movie title
		System.out.print("Movie name is " + MovieName + "\n");
		
		assertEquals(MovieName, ExpectedName); // verify get title and expected title 
		
		String Rating2= POM.Rating.getText(); // get rating of the movie 
		Ratings[1] = POM.Rating.getText(); // add the rating in the array
		System.out.print("Movie Rating is " + Rating2 + "\n");
	}

	
	
	@Test(priority=7) // verfiy release date
	public void VerifyReleaseDate2() throws InterruptedException
	{

		String MovieDate=POM.Date1.getText(); // get release date
		String ExpectedDate= "Release Date : 2022-06-29"; // expected release date
		System.out.print("Movie release date is " + MovieDate + "\n");
		
		assertEquals(MovieDate, ExpectedDate); // verify the expected and actual release date 
		
		driver.navigate().back(); // go back
		Thread.sleep(3000);	// wait 3 seconds
}
	
	@Test(priority=8) // click on movie at third place
	public void ClickedonMovie3() throws InterruptedException 
	{
		POM =new TheMoviePOM(driver);
		POM.Movie3.click(); // click movie
		Thread.sleep(3000); // wait 3 seconds
	
	}
	
	@Test(priority=9) // Verify movie
	public void VerifyMovie3() throws InterruptedException
	
	{	
		String MovieName= POM.Title1.getText(); // get movie actual title
		String ExpectedName= "Doctor Strange in the Multiverse of Madness"; // expected movie title
		System.out.print("Movie name is " + MovieName + "\n");
		
		assertEquals(MovieName, ExpectedName); // verify actual and expected movie title
		
		String Rating3= POM.Rating.getText(); // get ratings
		Ratings[2] = POM.Rating.getText(); // add ratingd to array
		System.out.print("Movie Rating is " + Rating3 + "\n");
	}
	
	@Test(priority=10) //verify release date
	public void VerifyReleaseDate3() throws InterruptedException
	{
	
		String MovieDate=POM.Date1.getText(); // actual release date
		String ExpectedDate= "Release Date : 2022-05-04"; // expected release date
		System.out.print("Movie release date is " + MovieDate + "\n"); 
		
		assertEquals(MovieDate, ExpectedDate); // verify actual and expected release date
		
		driver.navigate().back(); // go back
		Thread.sleep(3000);	// wait 3 seconds
}

	
	@Test(priority=11) // click on movie four
	public void ClickedonMovie4() throws InterruptedException 
	{
		POM =new TheMoviePOM(driver);
		POM.Movie4.click(); // click on movie 
		Thread.sleep(3000);
	
	}
	
	@Test(priority=12) // verify movie
	public void VerifyMovie4() throws InterruptedException
	
	{	
		String MovieName= POM.Title1.getText(); //get actual movie title
		String ExpectedName= "Jurassic World Dominion"; // expected movie title
		System.out.print("Movie name is " + MovieName + "\n");
		
		assertEquals(MovieName, ExpectedName); // verify movie title
		
		String Rating4= POM.Rating.getText(); // get rating
		Ratings[3] = POM.Rating.getText(); // add rating to the array
		System.out.print("Movie Rating is " + Rating4 + "\n");
	}
	
	@Test(priority=13) // verify release date
	public void VerifyReleaseDate4() throws InterruptedException
	{
	
		String MovieDate=POM.Date1.getText(); // get actual release date
		String ExpectedDate= "Release Date : 2022-06-01"; // expected release date
		System.out.print("Movie release date is " + MovieDate + "\n");
		
		assertEquals(MovieDate, ExpectedDate); // verify actual and expected release dates
		
		driver.navigate().back(); // go back
		Thread.sleep(3000);	// wait 3 seconds
	}
		@Test(priority=14) // this will sort the array in ascending oreder
		public void Sort()
		{
		Arrays.sort(Ratings); // Ascending order sort of the Ratings
		System.out.printf("The Sorted movie ratings are: %s", Arrays.toString(Ratings));
		
		}
	}
	
	

