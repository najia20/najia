Feature:  This feature is for verifying user profile

Scenario:Verify user profile is displayed
Given Open demoblaze "<URL>" application
Then click login link
Then Enter valid user name and password and click login
Then Verify username is displayed in the profile successfully

Scenario:Verify add to cart button is displayed
Given Open demoblaze "<URL>" application
Then  click login link
Then Enter valid user name and password and click login
Then user click product title
Then user verifies add to cart button is displayed
@profile
Scenario:Verify place order button is displayed
Given Open demoblaze "<URL>" application
Then  click login link
Then Enter valid user name and password and click login
Then user click product title
Then user click add to cart button and ok and cart link

Then user verifies place order button is displayed