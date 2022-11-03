package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Driverconnection;

public class Datadriven {
	
	
	WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		driver = Driverconnection.getConnection();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "dp")
	public void test(String uname, String pass,String otp)
	{
		//System.out.println(uname+" "+pass);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(uname);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(pass);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	@DataProvider(name="dp")
	public Object[][] myData()
	{
		ExcellReader ex = new ExcellReader("C:\\Users\\chintan\\Desktop\\Login.xlsx","mytest");
		int row = ex.rowCount();
		int col = ex.colCount();
		
		Object obj[][] = new Object[row-1][col];
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = ex.getData(i, j);
				obj[i-1][j] = data;
			}
		}
		
		return obj;
		
	}
}
