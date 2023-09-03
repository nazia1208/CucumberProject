package com.aiite.pagefactory;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aiite.basepackage.BaseClass;

public class SwagPage extends BaseClass{
	
	public SwagPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="user-name")
	public WebElement userName;
	
	@FindBy(id="password")
	public WebElement passWord;
	
	@FindBy(id="login-button")
	public WebElement loginBtn;
	
	@FindBy(tagName="h3")
	public WebElement error;

}
