package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioAndCheckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium_jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html?m=1");
		List<WebElement> radio= driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		for (int i = 0; i < radio.size(); i++) {
			//System.out.println("inside :");
			WebElement local=radio.get(i);
			String value=local.getAttribute("value");
			System.out.println("radio button: "+value);
			if (value.equalsIgnoreCase("ruby")) {
				local.click();
				
			}
			
			
		}
		
	}

}
