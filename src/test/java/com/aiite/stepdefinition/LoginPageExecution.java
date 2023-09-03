package com.aiite.stepdefinition;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageExecution {
	
	@Given("Launch the browser and load facebook Url")
	public void launch_the_browser_and_load_facebook_Url() {
		BaseClass.browserLaunch();
		BaseClass.loadUrl("https://www.facebook.com/");
		System.out.println("Site lauched");
	}

	@When("Provide valid {string} and {string} later hit Login")
	public void provide_valid_and_later_hit_Login(String userName, String password) {
		LoginPage lp = new LoginPage();
		lp.getUserName().sendKeys(userName);
		lp.passWord.sendKeys(password);
		lp.loginBtn.click();
		System.out.println("Provided the credentials");
	    
	}

	@Then("Validate the user and close browser")
	public void validate_the_user_and_close_browser() {
	    //Validation
		BaseClass.closeBrowser();
	}

}
