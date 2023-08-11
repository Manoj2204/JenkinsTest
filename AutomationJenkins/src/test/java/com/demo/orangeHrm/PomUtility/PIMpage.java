package com.demo.orangeHrm.PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIMpage 
{
	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstnameTbx;
	
	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middlenameTbx;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastnameTbx;
	
	@FindBy(xpath = "//input[@class='oxd-input oxd-input--active' and not (@placeholder)]")
	private WebElement employeeidTbx;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	
	public PIMpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstnameTbx() {
		return firstnameTbx;
	}

	public WebElement getMiddlenameTbx() {
		return middlenameTbx;
	}

	public WebElement getLastnameTbx() {
		return lastnameTbx;
	}

	public WebElement getEmployeeidTbx() {
		return employeeidTbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	
	
	

}
