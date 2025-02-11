Feature: Feature to test Google Search Functionality

@Smoke
Scenario: Validate Google Search is Working

Given User Able to Open Google Search Page
When User Enters Text in Seach box 
And Clicks on Seach button
Then User should navigated to searched page
