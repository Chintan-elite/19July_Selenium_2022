package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {
	public static void main(String[] args) {
		
		String driverPath = "D:\\BrowserDriver\\chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
//		String data =  driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[2]/td[3]")).getText();
//		System.out.println(data);
		
		
		List<WebElement> rows =  driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
	
		for(int i=2;i<=rows.size();i++)
		{
			List<WebElement> cols =  driver.findElements(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td"));
			for(int j=1;j<=cols.size();j++)
			{
				 String data =  driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				 System.out.print(data+" ");
			}
			System.out.println();
		}
		
		driver.quit();
	}
}
