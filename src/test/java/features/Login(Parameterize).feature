Feature: Application parameter Login

Scenario Outline: Login Validation
Given Navigate to Login URL
When  Enter login Details <UserName> <Password>
Then  User navigate to Home Page is "true"
And   User able to do foodOrder Page is "true"

Examples:
|UserName                 |Password     |
|sudheer.andra@gamail.com | 123456      |
|satishbabu.andra@gmail.com|4567829     |
