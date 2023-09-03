Feature: This feature is to test scenarios of summary page.

	Scenario: This scenario is to test sign up with valid details.
	 Given Launch the browser and load the Url
	 And Navigage to Sign up Page
	 
	 When Provide valid details and create an account
	 |FirstName|LastName|PhoneNo|PassWord|
	 |Azhar|Mohamed|9677171498|Test@123|	 
	 |Bharkavi|Kaliyaperumal|900329009|Test@125|
	 |Kumar|Lakshmanan|8397903892|Task@123|
	 
	 Then Validate the logged user and close browser