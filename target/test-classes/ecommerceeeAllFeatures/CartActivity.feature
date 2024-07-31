Feature:This scenario is for verifying cart functionality

Scenario:Verify add to cart button is clickable
Given Open demoblaze "<URL>" application
Then user click product title
Then user click add to cart button 
Then user verifies add to cart button is clickable 

Scenario:Verify product is displayed after adding to the cart
Given Open demoblaze "<URL>" application
Then user click product title
Then user click add to cart button and ok and cart link
Then user verifies product is added to the cart successfully
@cart
Scenario:Verify user can delete item from cart successfully

Given Open demoblaze "<URL>" application
Then user click product title
Then user click add to cart button and ok and cart link
Then user click delete button
Then user verifies item is deleted from cart successfully



