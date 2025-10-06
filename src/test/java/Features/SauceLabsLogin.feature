@sauceLabsValid
Feature: Login Functionality

Scenario: Login with valid credentials

Given User able to access Login URL
When User enter valid username and valid password
And click on Login button
Then it should redirected to Inventory Screen


Scenario: Login with Invalid credentials

Given User able to access Login URL
When User enter Invalid username and password
And clicks on Login button
Then It should show Error Message