package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class TagnameDemo {
	public static void main(String[] args) {
		
	 WebDriver driver = Driverconnection.getConnection();
	 driver.get("https://www.amazon.in/");
	 
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 for(WebElement link : links)
	 {
		 System.out.println(link.getAttribute("href"));
		 System.out.println(link.getText());
	 }
	
	 driver.quit();
	}
}
