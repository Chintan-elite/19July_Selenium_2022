package basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import util.Driverconnection;

public class ScreenShot {
	
	public static void getImage(WebDriver driver, String path)
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
	
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://topsint.com/topserp/index.php");
		
		getImage(driver,"D:\\newgit\\home.png");
		
		driver.findElement(By.name("btn_login")).click();
		
		getImage(driver,"D:\\newgit\\err.png");
	}
}
