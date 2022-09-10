package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.Driverconnection;

public class AlertDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
	//	driver.findElement(By.id("alertButton")).click();
	//	driver.switchTo().alert().accept();
		
			driver.findElement(By.id("timerAlertButton")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
	}
}
