Feature: Free CRM Login Feature

#Data Driven without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of Login Page is Free CRM
#Then user enters "harrys" and "Harry@123"
#Then user clicks on login button
#Then user on home page
#Then user mouse over on Contacts Link
#Then user click on New Contact Link
#Then user enters contact details
#Then user clicks on Save button
#Then verify new contact created
#Then close browser


#Data Driven with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of Login Page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user on home page
Then user mouse over on Contacts Link
Then user click on New Contact Link
Then user enters contact details
Then user clicks on Save button
Then verify new contact created
Then close browser

Examples:
	|	username	|	password	|
	|	harrys		|	Harry@123	|
	|	naveenk		|	test@123	|
