package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class Multiplewindow {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://demo.guru99.com/popup.php");
		String mainwind =  driver.getWindowHandle();
		System.out.println("Main  : "+mainwind);
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allwin = driver.getWindowHandles();
		for(String s : allwin)
		{
			if(!s.equals(mainwind))
			{
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		
//		driver.close();
//		driver.switchTo().window(mainwind);
//		driver.close();
		
		driver.quit();
		
	}
}
