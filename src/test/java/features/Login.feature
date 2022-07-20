Feature: Application Login

Scenario: Home Page Default login
Given User is on Netbanking Login Page
When User login with cred
Then Home Page visible
And card are display