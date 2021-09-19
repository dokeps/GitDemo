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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Frame {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a= new Actions(driver);
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		
		
		
		
		
	}
	
	public void print() {
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("learning git");
		System.out.println("Again hi");
		
		
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("learning git");
		System.out.println("Again hi");
		
		
	}
	
	public void printData() {
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("learning git");
		System.out.println("Again hi");
		
		
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("learning git");
		System.out.println("Again hi");
		
		
		
	}
	
	public void printnrwData() {
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("learning git");
		System.out.println("Again hi");
		
		
		System.out.println("Hi");
		System.out.println("Hello");
		System.out.println("learning git");
		System.out.println("Again hi");
		
		
	}

}
