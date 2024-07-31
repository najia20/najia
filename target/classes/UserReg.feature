Feature: This is for user registration 

Scenario:Verify User Reg
Given Open ecommerceee "<URL>" application
Then click account link
Then Enter user name,email  and password and click reg
Then Verify user reg successfully