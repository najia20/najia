Feature:  This feature is for verifying user login

Scenario:Verify user login
Given Open ecommerceee "<URL>" application
Then click account link
Then Enter user name and password and click login
Then Verify user login successfully
