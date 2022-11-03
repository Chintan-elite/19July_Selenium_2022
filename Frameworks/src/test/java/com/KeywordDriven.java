package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.Driverconnection;

public class KeywordDriven {
	
	
	WebDriver driver;
	
	@Test(dataProvider = "dp")
	public void test(String function, String keyword, String locator, String location, String data)
	{
		//System.out.println(function+" "+keyword+" "+locator+" "+location+" "+data);
	
		if(keyword.equals("browser"))
		{
			if(data.equals("ff"))
			{
				String driverPath = "D:\\BrowserDriver\\geckodriver.exe";
				String key = "webdriver.gecko.driver";	
				System.setProperty(key, driverPath);
				driver = new FirefoxDriver();
			}
			else if(data.equals("chrome"))
			{
				String driverPath = "D:\\BrowserDriver\\chromedriver.exe";
				String key = "webdriver.chrome.driver";
				System.setProperty(key, driverPath);
				driver = new ChromeDriver();
			}
		}
		else if(keyword.equals("url"))
		{
			driver.get(data);
		}
	
	
	
	
	}
	
	@DataProvider(name="dp") 
	public Object[][] myData()
	{
		ExcellReader ex = new ExcellReader("C:\\Users\\chintan\\Desktop\\Login.xlsx","keydata");
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
