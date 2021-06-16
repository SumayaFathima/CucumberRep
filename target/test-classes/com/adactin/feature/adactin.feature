@End2End
Feature: To validate the login functionality of the given application 

@Sanity
 Scenario: To verify login functionality with valid username and invalid password for facebook
	
		When User will hit the URL 
		And User will enter the Username and Password
		
		| Username | Password | 
		| Selenium | Sel@123  | 
		| Java 	   | Java@123 |
		| API      | Api@123  |		
		And User will click the login button 
		Then User will verify the login functionality
@Smoke
 Scenario: To verify login functionality with invalid username and valid password for Instagram 		
		
		When User will hit the url 
		And User will enter the Username and PASSWORD
		And User will click the LOGIN button 
		Then User will verify the LOGIN functionality	
	