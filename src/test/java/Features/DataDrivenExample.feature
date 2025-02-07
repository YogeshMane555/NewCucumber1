Feature: Using Data Driven Examples

Scenario Outline: Login with Valid & Invalid Credentials

Given User able to open Login Page
When User Enter <Username> and <Password>
And Clicks on Login button
Then User is redirected to Home Screen


Examples:
| Username | Password |
| Yogesh | Password753 |
| student | Password123 |
| Mane | Admin984 |