package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchBrowser 
{
	@Test
	public void name() 
	{
		
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Reporter.log("Hello World!....",true);
		driver.quit();
	}
	@Test
	public void name1() 
	{
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Reporter.log("We got job",true);
		driver.quit();
		
	}

}
