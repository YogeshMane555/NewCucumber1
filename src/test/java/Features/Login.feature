Feature: Feature to test Login Functionality

@smoketest
Scenario: Check login with Valid Credentials

Given User is on Login Page
When User Enter Valid Username and Password 
And Clicks on Login button
Then User should be Navigated to Home Screen

