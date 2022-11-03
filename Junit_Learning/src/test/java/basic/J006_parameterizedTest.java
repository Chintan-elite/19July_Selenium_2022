package basic;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

@RunWith(Parameterized.class)
public class J006_parameterizedTest {
	
	String username;
	String password;
	
	public J006_parameterizedTest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		 driver = Driverconnection.getConnection();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void login()
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
	}
	
	@Parameters
	public static List<Object[]> getdata()
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
		
		return Arrays.asList(obj);
		
	}
	
}
