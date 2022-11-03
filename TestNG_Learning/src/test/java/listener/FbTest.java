package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.Driverconnection;

public class FbTest {
		
	@Test
	public void titleCheck(ITestContext c)
	{
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://www.facebook.com/");
		c.setAttribute("mydriver", driver);
		assertEquals("FB", driver.getTitle());
	}
}
