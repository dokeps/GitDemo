package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Select s= new Select(driver.findElement(By.name("birthday_day")));
		s.selectByVisibleText("18");
		
		Select s1= new Select(driver.findElement(By.name("birthday_month")));
		s1.selectByIndex(8);;
		
		Select s2= new Select(driver.findElement(By.name("birthday_year")));
		s2.selectByVisibleText("1997");
		
	}

}
