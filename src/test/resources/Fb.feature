Feature: To Validate the login functionality of gmail application

Background:
Given To launch the chrome browser and maximize window

Scenario: To Validate login with valid username
When To launch the url of the gmail application
And To pass valid username in email field
And To click the login button
And To check whether navigate to the home page or not
Then To close the browser
Scenario Outline: To validate the positive and negative combination of login functionality
When User has to hit the gmail url
And User has to pass the data "<emaildatas>" in email field
And User has to click login button
Then User has to close the browser
Examples:
|emaildatas	|					
|sanalsanal@gmail.com	|
|abc@gmail.com		|		
|hello@gmail.com	|		
|inmakes@gmail.com	|	
|software@gmail.com		|
|dsklvbkvjb@gmail.com	|