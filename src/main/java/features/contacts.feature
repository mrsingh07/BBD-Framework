Feature: Free CRM Create Contacts

Scenario Outline: Free CRM create a new contact Scenario

Given user is already on Login Page
When title of Login Page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user on home page
Then user mouse over on Contacts Link
Then user click on New Contact Link
Then user enters new contact detail "<firstname>" and "<lastname>" and "<mobileNo>"
Then user clicks on Save button
Then verify new contact created
Then close browser

Examples:

		|	username	|	password	|	firstname	|	lastname	|	mobileNo	|
		|	harrys		|	Harry@123	|	Tom				|	Peter			|	9890098900|
		|	harrys		|	Harry@123	|	Peter			|	Benz			|	9890098901|