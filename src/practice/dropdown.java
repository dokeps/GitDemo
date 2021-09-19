package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html?m=1");
		WebElement tutorial=driver.findElement(By.xpath("//button[@class='btn btn-default dropdown-toggle' and @id='menu1']"));
		tutorial.click();
		List<WebElement> allTools=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		for (WebElement webElement : allTools) {
			String innerhtml=webElement.getAttribute("innerHTML");
			System.out.println("innerHTML " +innerhtml);
			if (innerhtml.contentEquals("JavaScript")) {
				webElement.click();
				
			}
			
		}
		
	}

}
