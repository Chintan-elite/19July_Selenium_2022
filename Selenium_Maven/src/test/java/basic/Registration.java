package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	public static void main(String[] args) {
		
		
		String driverPath = "D:\\BrowserDriver\\chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, driverPath);
		WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
	
		WebElement signUp =  driver.findElement(By.linkText("Create New Account"));
		signUp.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("firstname")).sendKeys("Tops");
		driver.findElement(By.name("lastname")).sendKeys("tech");
		driver.findElement(By.name("reg_email__")).sendKeys("9865635274");
		driver.findElement(By.name("reg_passwd__")).sendKeys("tops123");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select days = new Select(day);
		Select months = new Select(month);
		Select years = new Select(year);
		
		days.selectByVisibleText("10");
		months.selectByIndex(2);
		years.selectByValue("2020");
		
		List<WebElement> gender =driver.findElements(By.name("sex"));
		gender.get(1).click();
	
	}
}
