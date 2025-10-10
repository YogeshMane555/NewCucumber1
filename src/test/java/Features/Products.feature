Feature: Adding multiple products

Background:

Given User able to access Login URL
When User enter valid username and valid password
And click on Login button
Then it should redirected to Inventory Screen

@addProduct
Scenario: Selecting all product and check AddToCart Page

Given User able to open Product Page

When user select all product
And click on AddToCart button
Then All selected product should be displayed in Cart