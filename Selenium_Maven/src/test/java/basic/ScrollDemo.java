package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class ScrollDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,100)");
		
		//WebElement ele = driver.findElement(By.linkText("Games"));
		
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
}
