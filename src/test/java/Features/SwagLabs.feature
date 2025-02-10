Feature: Feature to test Login page 

@Imp
Scenario: Test Login page with Valid Credentials

Given User able to access Swag Labs Web page
When User enter valid Username and Password
And clicks on Login button
Then User navigated to Home screen


Scenario: Add Multiple Items in Add to Carts

Given User able to access Home screen after Login
When User clicks on Sauce Labs backpack Add to cart
And clicks on Sauce Labs Bike Light Add to cart button
And Clicks on Add to cart button 
Then Items which are selected that is visible on Add to cart page
