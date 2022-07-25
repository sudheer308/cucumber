Feature: Application TwoWaybinding 

Scenario: two-way binding validation

Given User Invoke ChromeBrowser
And Open website "https://rahulshettyacademy.com/angularpractice/"
When Enter "sudheer" in to name field
Then User able to see the name in two-way binding "sudheer"
And close the Browser