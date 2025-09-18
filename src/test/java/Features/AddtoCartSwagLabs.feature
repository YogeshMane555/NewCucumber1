Feature: Feature is to test Add to Cart Functionality

Background: Login to Swag Labs 

Given User able to access swag labs
When User enter Valid Username and Password
And click on Login button
Then User is navigated to home screenn

@AddToCart
Scenario: Add two Items and check Add to Cart functionality is working or not

When User click on Add to Cart button for Fleece Jacket and Bolt T-shirt
And Clicks on Add to Cart button at Header section
Then on Cart Screen Selected item is displayed

@CheckOut
Scenario: Remove Bolt T-Shirt & Checkout

When User clicks on remove button for fleece Jacket
And clicks on Checkout button
Then User is navigated to Payment screen

