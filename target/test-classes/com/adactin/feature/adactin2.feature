@Performance
Feature: To validate the login functionality of the given application 

@Smoke
 Scenario: To verify login functionality with valid username and invalid pass

		When USER will hit the URL 
		And USER will enter the Username and Password
		And USER will click the login button 
		Then USER will verify the login functionality