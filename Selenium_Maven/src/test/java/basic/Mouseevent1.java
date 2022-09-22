package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class Mouseevent1 {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"shoppingCart1\"]/div"));
		
		
		Actions builder = new Actions(driver);
		
	  	Action drag =   builder.clickAndHold(from)
				.moveToElement(to)
				.release()
				.build();
		
		drag.perform();
		
	}
}
