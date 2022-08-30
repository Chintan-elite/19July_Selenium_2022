package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logincheck {
	public static void main(String[] args) {
		
		
		String driverPath = "D:\\BrowserDriver\\chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, driverPath);
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement email =   driver.findElement(By.id("email"));
		WebElement pass =   driver.findElement(By.id("pass"));
		
		email.sendKeys("tops");
		pass.sendKeys("abc123");
		
		
		
	}
}
