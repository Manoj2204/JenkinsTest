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

}
