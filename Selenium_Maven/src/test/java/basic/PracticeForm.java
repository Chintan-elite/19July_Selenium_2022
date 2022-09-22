package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.Driverconnection;

public class PracticeForm {
	public static void main(String[] args) {
		
		
		WebDriver driver = Driverconnection.getConnection();
		driver.get("https://demoqa.com/automation-practice-form");
		
		
		driver.findElement(By.id("firstName")).sendKeys("tops");
		driver.findElement(By.id("lastName")).sendKeys("tech");
		driver.findElement(By.id("userEmail")).sendKeys("tops@gmial.com");
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("2356897485");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		String myMonth = "June";
		
		WebElement month = driver.findElement(By.className("react-datepicker__month-select"));
		Select months = new Select(month);
		months.selectByVisibleText(myMonth);
		
		
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select years = new Select(year);
		years.selectByVisibleText("2000");
		
		
		String date = "11";
		
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='react-datepicker__week']/div"));
		//System.out.println(dates.size());
		
		for(WebElement dt : dates)
		{
			if(dt.getText().equals(date))
			{
				if(dt.getAttribute("aria-label").contains(myMonth))
				{
					dt.click();
					break;
				}
					
			}
		}
		
		
		
	}
}
