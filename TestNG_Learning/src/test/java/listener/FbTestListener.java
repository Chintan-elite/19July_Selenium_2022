package listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FbTestListener implements ITestListener
{
	public void onTestFailure(ITestResult result) {
		
		WebDriver driver = (WebDriver) result.getTestContext().getAttribute("mydriver");
		String path = "D:\\topsgit\\home.png";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
