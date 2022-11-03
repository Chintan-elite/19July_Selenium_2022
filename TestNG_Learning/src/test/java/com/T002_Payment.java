package com;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T002_Payment {
		
	
	@Test
	public void debitCard()
	{
		System.out.println("running debit card test");
	}
	
	@Test(groups = "smoke")
	public void creditCard()
	{
		System.out.println("Runnibg credidt card test");
	}
	
	@Test(groups = "sanity")
	public void cod()
	{
		System.out.println("running cod test");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Running before every test");
	}
}
