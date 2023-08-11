package com.demo.orangeHrm.PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameTbx;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTbx;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTbx() {
		return usernameTbx;
	}

	public WebElement getPasswordTbx() {
		return passwordTbx;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	

}
