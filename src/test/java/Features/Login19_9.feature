@Yogesh
Feature: To check Login Feature

Scenario: Check with Valid Inputs 

Given User navigated to SauceDemo URL
When User Enter Valid Username
And  Valid Password and Clicks on Login button
Then it redirected to Home Screen


Scenario: Add to Cart Functionality

Given User Navigated to SauceDemoHome Screen
When User click Add to cart for backpack 
And Clicks on main AddTOCart Button
Then  Selected Item is displayed