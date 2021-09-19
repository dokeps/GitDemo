package practice;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.apache.commons.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement generateAlert=driver.findElement(By.id("timerAlertButton"));
		generateAlert.click();
		Thread.sleep(1000);
		org.openqa.selenium.Alert a= driver.switchTo().alert();
		a.accept();
		
		
		
		
		
	}

}
