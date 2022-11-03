package basic;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class J005_AnnontationDemo1 {
	
	static WebDriver driver ;
	@BeforeClass
	public static void openBrowser()
	{
		driver = Driverconnection.getConnection();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void titlecheck()
	{
		
		assertEquals(driver.getTitle(), "FB");
	}
	
	
	@Test
	public void login()
	{
		
		driver.findElement(By.id("email")).sendKeys("tops@hkp.com");
		driver.findElement(By.id("pass")).sendKeys("yjff3454");
	}
	
	@AfterClass
	public static void close()
	{
		driver.quit();
	}
}
