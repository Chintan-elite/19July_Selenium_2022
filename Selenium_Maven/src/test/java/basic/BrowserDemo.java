package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDemo {
	public static void main(String[] args) {
		
		String driverPath = "D:\\BrowserDriver\\chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, driverPath);
		WebDriver driver = new ChromeDriver();

//		String driverPath = "D:\\BrowserDriver\\geckodriver.exe";
//		String key = "webdriver.gecko.driver";
//		System.setProperty(key, driverPath);
//		WebDriver driver = new FirefoxDriver();
		
	}
}
