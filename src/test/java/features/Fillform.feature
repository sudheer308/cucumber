Feature: Application Form

Scenario: Form validation

Given User Invoke ChromeBrowser
And Open website "https://rahulshettyacademy.com/angularpractice/"
When Enter all fields into corresponding fields
And Click on submit button
Then User able to see successfull Message on screen "Success! The Form has been submitted successfully!."
And close the Browser
