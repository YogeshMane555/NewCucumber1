@SmoKE
Feature: To check Add to cart functionality

Background: User able to login to Swag Labs

Given User able to access Swag Labs Login page
When User enter username and password
And clicks on Login button
Then User is navigated to Home Screen


Scenario: To validate add to cart fucntionality

When User select Add to Cart button on Backpack and Bike Light Add to cart button
And After clicking on Add to cart main button
Then Selected Item is able to see
