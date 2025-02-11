Feature: Feature to test Login Functionality

@RegressionTesting
Scenario: Validate with Valid Username and Password

Given User able to open DemoLogin Page
When User enter Valid Username and Valid Password
And clicks on Submit button
Then User is redirected to HomeScreen Page

