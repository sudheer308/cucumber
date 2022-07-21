Feature: Application Login

Scenario: Home Page Default login
Given User is on Netbanking Login Page
When User login with uname "sudheer" pword "123435"
Then Home Page is visible "true"
And card are display on screen is "true"

Scenario: Home Page Default login
Given User is on Netbanking Login Page
When User login with uname "satish" pword "56789012345"
Then Home Page is visible "false"
And card are display on screen is "false"