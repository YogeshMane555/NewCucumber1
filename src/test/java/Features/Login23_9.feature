Feature: To check Login Functionality

Background:
Given I am on OpenCart Login Page



Scenario: Login with Valid Credentials

Given I enter valid Username and Valid Password
When I click on Login button
Then It should be Logged in Successfully

