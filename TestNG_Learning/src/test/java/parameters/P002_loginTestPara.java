package parameters;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Driverconnection;

public class P002_loginTestPara {
	
	WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		 driver = Driverconnection.getConnection();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "dp")
	public void test(String uname, String pass)
	{
		//System.out.println(uname+" "+pass);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(uname);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(pass);
	}
	

	@DataProvider(name="dp")
	public static Object[][] getdata()
	{
		Object[][] obj = new Object[4][2];
		
		obj[0][0] = "khinal@gmial.com";
		obj[0][1] = "khinal123";
		
		obj[1][0] = "sweta@gmial.com";
		obj[1][1] = "swta123";
		
		obj[2][0] = "parth@gmial.com";
		obj[2][1] = "khinal123";
		
		obj[3][0] = "sugandh@gmial.com";
		obj[3][1] = "khinal123";
		
		return obj;
		
	}
}
