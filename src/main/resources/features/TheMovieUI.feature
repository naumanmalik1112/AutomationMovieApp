@tag
Feature: TheMovie App UI Tests

  @tag1
  Scenario: App Accessibility
    Given I have an Android Phone
    And I have TheMovies app installed
    When I click on the app icon
    Then TheMovies app should open
    And I should see app home page with <apptitle>

  @tag2
  Scenario Outline: Verify TheMovies scroll functionality
    Given I have opened TheMovies application
    And I can see the list of movies
    And I see the first movie is <firstmoviename>
    When I scroll the screen
    Then I should see the last movie is <lastmoviename>
    
    @tag3
    Scenario Outline: Verify Movie description page is accessible
    Given I have opened TheMovies application
    And I see the available movies
    When I click on <moviename>
    Then I should see the next screen with <moviename> details
    
    @tag4
    Scenario Outline: Verify the Movie Poster and Name
    Given I have opened TheMovies application
    When I have open the <moviename> details
    Then I should see Movie Poster and <moviename>
    
    @tag5
    Scenario Outline: Verify movie release date
    Given I have opened TheMovies application
    And I have opened the <moviename> details
    When I see the <moviename> and Poster
    Then I should see the <moviereleasedate>
    And <moviereleasedate> should be in the format <yyyy-mm-dd>
    
    
    @tag6
    Scenario Outline: Verify the Rating
    Given I have opened TheMovies application
    And I have opened the <moviename> details
    When I see the <moviename> and Poster
    Then I should see <moviename> <ratings>
    
    @tag7
    Scenario Outline: Verify the title Trailers
    Given I have opened TheMovies application
    And I have opened the <moviename> details
    Then I should see <trailer> heading with <moviename> trailers
    
    @tag8
    Scenario Outline: Verify the Right Scroll in trailers
    Given I have opened TheMovies application
    When I have opened the <moviename> details
    And I see <trailer> heading with <moviename> trailers
    Then trailers should be righ scrollable
    
    @tag9
    Scenario Outline: Verify the Summary heading title
    Given I have opened TheMovies application
    And I have opened the <moviename> details
    When I see <trailer> heading with <moviename> trailers
    Then I should see <summary> heading with some text as summary
    
    @tag10
    Scenario Outline: Verify the Reviews heading title
    Given I have opened TheMovies application
    And I have opened the <moviename> details
    And I see <trailer> heading with <moviename> trailers
    When I should see <summary> heading with some text as summary
    Then I should see <reviews> heading with text underneath
    
    @tag11
    Scenario Outline: Movie detail page should be scrollable
    Given I have opened TheMovies application
    And I have opened the <moviename> details
    Then the page should be scrollable upwards
    
