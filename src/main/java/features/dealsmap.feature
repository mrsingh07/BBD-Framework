Feature: Free CRM Create Deals

Scenario: Free CRM create a new deal Scenario

Given user is already on Login Page
When title of Login Page is Free CRM
Then user enters username and password

|	username	|	password	|
|	harrys		|	Harry@123	|

Then user clicks on login button
Then user on home page
Then user mouse over on Deals Link
Then user click on New Deal Link
Then user enters new deal details

|	title		|	company	|	amount	|	probability	|	commission	|
|	Laptop	|	HP			|	40000		|	70					|	10				|
|	DVD			|	Philips	|	5000		|	80					|	20				|	
|	CCTV		|	CISCO		|	9000		|	50					|	40				|

Then verify new deal created
Then close browser