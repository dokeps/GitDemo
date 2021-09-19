package practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindow {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='blinkingText' and @target='_blank']")).click();;
		 Set<String> windows=driver.getWindowHandles();
		 Iterator<String> it=windows.iterator();
		 String parentId=it.next();
		 String childId=it.next();
		 driver.switchTo().window(childId);
		 
		String email= driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(email);
		
		
		
		
	}

}
