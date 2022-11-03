package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.Driverconnection;

public class P001_loginTestPara {
	
	@Parameters({"uname","pass"})
	@Test
	public void test(String uname, String pass)
	{
		//System.out.println(uname+" "+pass);
			WebDriver driver = Driverconnection.getConnection();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(uname);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(pass);
	}
}
