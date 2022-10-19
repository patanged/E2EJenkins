package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003 {

	
	@Test
	public void tc_001()
	{
		System.setProperty("webdriver.chrome.driver","./DriverFile/chromedriver.exe");
		ChromeDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.facebook.com/");
		Driver.findElement(By.name("email")).sendKeys("dinsh");
		Driver.findElement(By.name("pass")).sendKeys("Dinesh");
		Driver.close();
	}
}
