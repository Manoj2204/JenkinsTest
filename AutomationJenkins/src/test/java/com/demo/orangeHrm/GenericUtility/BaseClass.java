package com.demo.orangeHrm.GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public static WebDriver driver;
	public FileUtility fileUtility= new FileUtility();
	public ExcelUtility excelUtility =new ExcelUtility();
	@BeforeClass
	public void openBrowser() throws IOException 
	{
		String browserName = fileUtility.readDataFromPropertyFile("browser");
		if (browserName.equals("chrome")) 
		{
			driver = new ChromeDriver();
		}
		else if (browserName.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		else if (browserName.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(fileUtility.readDataFromPropertyFile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterClass
	public void closeBrowser() 
	{
		driver.manage().window().minimize();
		driver.quit();
	}
		
}


