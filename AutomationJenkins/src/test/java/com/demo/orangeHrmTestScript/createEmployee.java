package com.demo.orangeHrmTestScript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.demo.orangeHrm.GenericUtility.BaseClass;
import com.demo.orangeHrm.PomUtility.DashboardPage;
import com.demo.orangeHrm.PomUtility.Loginpage;
import com.demo.orangeHrm.PomUtility.PIMpage;

public class createEmployee extends BaseClass
{
	@Test
	public void AddEmployee() throws IOException, Throwable 
	{
		Loginpage login = new Loginpage(driver);
		login.getUsernameTbx().sendKeys(fileUtility.readDataFromPropertyFile("username"));
		login.getPasswordTbx().sendKeys(fileUtility.readDataFromPropertyFile("password"));
		login.getLoginBtn().click();
		
		Actions action = new Actions(driver);
		DashboardPage dashpage = new DashboardPage(driver);
		WebElement getPIMBtn = dashpage.getPIMBtn();
		action.moveToElement(getPIMBtn).click().perform();
		dashpage.getAddEmpBtn().click();
		PIMpage pimpage=new PIMpage(driver);
		String fname = excelUtility.readStringData("employeeDetail",2,1);
		pimpage.getFirstnameTbx().sendKeys(fname);
		//pimpage.getFirstnameTbx().sendKeys(excelUtility.readStringData("employeeDetail", 2, 1));
		Thread.sleep(5000);
	}

}
