package dependency;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class MyTest {
	
	@Test(priority = 1)
	public void logintest()
	{
		//assertFalse(true);
		System.out.println("running login test");
		
	}
	
	@Test(priority = 2,dependsOnMethods ="logintest")
	public void home()
	{
		System.out.println("running home test");
	}
	
	@Test(priority = 3,dependsOnMethods = "home")
	public void logout()
	{
		System.out.println("running logout test");
	}
}
