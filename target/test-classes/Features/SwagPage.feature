#This is my first feature file

Feature: This feature is to test scenarios of SwagPage.

Background: 
	Given Launch the browser and load the Url	

	Scenario: This scenario is to test Login with Valid Credential.
#	 Given Launch the browser and load the Url
	 When Provide valid credential and hit Login
	 Then Validate the logged user and close browser

	 Scenario: This scenario is to test Login with Invalid Credential.
#	 Given Launch the browser and load the Url
	 When Provide invalid 878467 and "Welcome@123" then hit Login
	 Then Validate the error msg and close browser
	 
#	 Scenario: This scenario is to test Login with Invalid Credential.
#	 Given Launch the browser and load "https://www.saucedemo.com/" Url
#	 When Provide invalid 878467 and "Welcome@123" then hit Login
#	 Then Validate the error msg and close browser
	 
#	 Scenario: This scenario is to test iPhone purchase with CreditCard.
#	 Given Launch the browser and load the Url
#	 And Login to the acccount and search for iPhones
#	 And Select the iphone 14 pro
#	 When Proceed to the checkout Page
#	 And Provide valid credit card details
#	 But place the order
#	 Then Validate the order is placed and OrderID generated
#	 And sign out the account and close browser