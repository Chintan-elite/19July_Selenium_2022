package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.Driverconnection;

public class CalenderDemo {
	public static void main(String[] args) {
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://www.nationalsportsid.com/register?type=1&embed=0");
		
		String myyear = "1970";
		String myMonth = "Jul";
		driver.findElement(By.id("hoopalert_user_registration_birthDate")).click();
		int flag = 0;
		
		do
		{
		List<WebElement> years = driver.findElements(By.xpath("//div[@class='datepicker-years']/table/tbody/tr/td/span"));
		for(WebElement y : years)
		{
			String year = y.getText();
			if(myyear.equals(year))
			{
				flag = 1;
				y.click();
				break;
			}
		}
		if(flag==0)
		{
			driver.findElement(By.xpath("//div[@class='datepicker-years']/table/thead/tr[2]/th[1]")).click();
		}
		}while(flag!=1);
		
		List<WebElement> months = driver.findElements(By.xpath("//div[@class='datepicker-months']/table/tbody/tr/td/span"));
		for(WebElement m : months)
		{
			if(m.getText().equals(myMonth))
			{
				m.click();
				break;
			}
		}
				
	}
}
