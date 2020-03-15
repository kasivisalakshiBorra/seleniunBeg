Feature: login page of Application				

Scenario Outline: Verification of login functionality with invalid credential
Given Open the Firefox and launch the application				
When Enter the Username "<username>" and Password "<password>" 				
Then Click login button								

Examples:                      		

|username  |password |		
|TEXTUSER      |TESTPASSWORD   |


Scenario Outline: Verification of login functionality with invalid credential
Given Open the Chrome and launch the application				
When Enter the Username "<username>" and Password "<password>"
Then Click login button						

Examples:                      		

|username  |password |		
|TEXTUSER      |TESTPASSWORD   |


Scenario Outline: Verification of login functionality with invalid credential
Given Open the IE and launch the application				
When Enter the Username "<username>" and Password "<password>" 				
Then Click login button						

Examples:                      		

|username  |password |		
|TEXTUSER      |TESTPASSWORD   |