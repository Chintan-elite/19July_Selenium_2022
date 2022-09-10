package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {
	
	public static void main(String[] args) {
		
		String driverPath = "D:\\BrowserDriver\\chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
		List<WebElement> headRow = driver.findElements(By.xpath("//table[@summary='Sample Table']/thead/tr/th"));
		for(int i=1;i<headRow.size();i++)
		{
			String data = driver.findElement(By.xpath("//table[@summary='Sample Table']/thead/tr/th["+i+"]")).getText();
			System.out.print(data +" ");
		}
		
		System.out.println();
		List<WebElement> bodyrow = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
		for(int i=1;i<bodyrow.size();i++)
		{
			String hdata = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/th")).getText();
			System.out.print(hdata+" ");
			List<WebElement> bodycol = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/td"));
			for(int j=1;j<bodycol.size();j++)
			{
				String data = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(data +" ");
			}
			System.out.println();
		}
		
		String fhead = driver.findElement(By.xpath("//table[@summary='Sample Table']/tfoot/tr/th")).getText();
		String fcol = driver.findElement(By.xpath("//table[@summary='Sample Table']/tfoot/tr/td")).getText();
		
		System.out.println(fhead+" "+fcol);
		
		
		
		driver.quit();
		
	}
}	
