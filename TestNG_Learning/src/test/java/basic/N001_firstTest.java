package basic;

import org.testng.annotations.Test;

public class N001_firstTest {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Running logintest");
	}
	
	@Test(priority = 2)
	public void home()
	{
		System.out.println("runnintg home test");
	}
	
	@Test(priority = 5, enabled = false)
	public void help()
	{
		System.out.println("runing help test");
	}
	
	@Test(priority = 4)
	public void beta()
	{
		System.out.println("runnig beta");
	}
	
	@Test(priority = 3)
	public void alpha()
	{
		System.out.println("running alpha");
	}

}
