package com.demo.orangeHrm.PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	@FindBy(xpath="//span[text()='PIM']")
	private WebElement PIMBtn;
	
	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmpBtn;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPIMBtn() {
		return PIMBtn;
	}

	public WebElement getAddEmpBtn() {
		return addEmpBtn;
	}

	
	

}
