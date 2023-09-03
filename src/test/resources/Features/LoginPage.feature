Feature: This feature is to test the login page scenarios.

Scenario Outline: This scenario is to test login functionality.
	 Given Launch the browser and load facebook Url
	 When Provide valid "<UserName>" and "<Password>" later hit Login
	 Then Validate the user and close browser
	 
Examples: 
	|UserName|Password|
	|anand@gmail.com|Test@123|
	|somiah@yahoo.in|Welcome!2| 