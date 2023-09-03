package com.aiite.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	public WebElement getUserName() {
		return userName;
	}
	
	@FindBy(id="pass")
	public WebElement passWord;
	
	@FindBy(name="login")
	public WebElement loginBtn;
	
	@FindBy(xpath="//a[@rel='async']")
	public WebElement createAccBtn;
	
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement firstName;
	
	@FindBy(name="lastname")
	public WebElement lastName;
}
