package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {
	public static void main(String[] args) {
		
		String driverPath = "D:\\BrowserDriver\\chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, driverPath);
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://topsint.com/topserp/index.php");
		
		//maximise browser
		driver.manage().window().maximize();
		
		//get title of webpage
		String title = driver.getTitle();
		String expected = "Welcome o TOPS Management System";
		
		if(title.equals(expected))
		{
			System.out.println("passed !!!");
		}
		else
		{
			System.out.println("Failed !!!");
		}
		
		//close browse
		driver.quit();
		
		//close perticular window
		//driver.close();
		
	}
}
