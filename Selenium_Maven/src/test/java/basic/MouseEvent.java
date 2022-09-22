package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.Driverconnection;

public class MouseEvent {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
//		for(WebElement frame : frames)
//		{
//			System.out.println(frame.getAttribute("data-src"));
//		}
		
		driver.switchTo().frame(frames.get(3));
		
		WebElement from =  driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement to = driver.findElement(By.id("trash"));
		
		
		Actions builder = new Actions(driver);
		
		//builder.dragAndDrop(from, to).perform();
		
		
		builder.clickAndHold(from)
				.moveToElement(to)
				.release()
				.build()
				.perform();
		
		
		
		
		
	}
}
