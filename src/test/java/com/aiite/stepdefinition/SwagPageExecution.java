package com.aiite.stepdefinition;


import org.junit.Assert;

import com.aiite.basepackage.BaseClass;
import com.aiite.pagefactory.SwagPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SwagPageExecution {

	@Given("Launch the browser and load the Url")
	public void launch_the_browser_and_load_the_Url() {
		BaseClass.browserLaunch();
		BaseClass.loadUrl("https://www.saucedemo.com/");
	}

	@When("Provide valid credential and hit Login")
	public void provide_valid_credential_and_hit_Login() {
		SwagPage sl = new SwagPage();
		sl.userName.sendKeys("standard_user");
		sl.passWord.sendKeys("secret_sauce");
		sl.loginBtn.click();
	}

	@Then("Validate the logged user and close browser")
	public void validate_the_logged_user_and_close_browser() {
		String expected = "https://www.saucedemo.com/inventory.html";
		String actual = BaseClass.getPresentUrl();
		Assert.assertEquals(expected, actual);
		BaseClass.closeBrowser();
	}
	
	@When("Provide invalid credential and hit Login")
	public void provide_invalid_credential_and_hit_Login() {
		SwagPage sl = new SwagPage();
		sl.userName.sendKeys("standard_user2");
		sl.passWord.sendKeys("secret_sauce2");
		sl.loginBtn.click();		
		Assert.assertTrue(sl.error.isDisplayed());
	}
	
	@Then("Validate the error msg and close browser")
	public void validate_the_error_msg_and_close_browser() {
		BaseClass.closeBrowser();
	}
	
	@Given("Launch the browser and load {string} Url")
	public void launch_the_browser_and_load_Url(String url) {
		BaseClass.browserLaunch();
		BaseClass.loadUrl(url);
	}

	@When("Provide invalid {int} and {string} then hit Login")
	public void provide_invalid_and_then_hit_Login(Integer intVal, String password) {
		SwagPage sl = new SwagPage();
		String userName = Integer.toString(intVal);
		sl.userName.sendKeys(userName);
		sl.passWord.sendKeys(password);
//		sl.loginBtn.click();
	}

}
