package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class KeyboardEvent {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		
		Actions builder = new Actions(driver);
		
		search.sendKeys("tops technologies");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='mkHrUc']/ul[1]/div/ul/li"));
		System.out.println(list.size());
		
		for(WebElement mydata : list)
		{
		   String dt =  mydata.getText();
		   System.out.println(dt);
		   if(dt.equals("tops technologies"))
		   {
			   System.out.println("test");
			   mydata.click();
		   }
		}
		
//		builder.click(search)
//				.sendKeys(search, "tops Technologies")
//				.sendKeys(Keys.ENTER)
//				.build()
//				.perform();
		
		
	}
}
