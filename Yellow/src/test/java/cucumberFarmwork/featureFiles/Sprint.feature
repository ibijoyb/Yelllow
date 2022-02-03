Feature: Login into Account 
Esixting user should be able to log in facebook successfuly with valid credentilas

Scenario: long intot account with correct details
Given User enter the URL
And user enter email & Pasword 
And user click on login button
And user should be able to login successfuly
Then user should be landed on the homepage 
