
package com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T001_Bank {
	
		@Test
		public void deposite()
		{
			System.out.println("Running diposite test");
		}
		
		@Test(groups = "smoke")
		public void widrow()
		{
			System.out.println("running widrow test");
		}
		
		@Test(groups = "sanity")
		public void getBalance()
		{
			System.out.println("runnning get balance");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("runinng before every bnk mehod..");
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("Running after every bank method");
		}
}
