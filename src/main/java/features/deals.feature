Feature: Free CRM Create Deals

Scenario: Free CRM create a new deal Scenario

Given user is already on Login Page
When title of Login Page is Free CRM
Then user enters username and password
|	harrys	|	Harry@123	|
Then user clicks on login button
Then user on home page
Then user mouse over on Deals Link
Then user click on New Deal Link
Then user enters new deal details
|	SSD	|	HP	|	4000	|	50	|	10	|	
Then user clicks on Save button
Then verify new deal created
Then close browser