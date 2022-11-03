package com;

import org.testng.annotations.Test;

public class T003_MyWeb {
	
	@Test(groups = "smoke")
	public void login()
	{
		System.out.println("Running login test");
	}
	
	@Test(groups = { "smoke","sanity"})
	public void home()
	{
		System.out.println("Runing home test");
	}
	
	@Test
	public void logout()
	{
		System.out.println("logout test");
	}
}
