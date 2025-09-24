@Ym
Feature: Swag Labs Login Functionality

Scenario: Login Validate with Correct Credentials

Given I am able to able Swag Labs Login Page
When I enter valid username and password
And Click on Login button
Then It should redirect to Invetory Page
