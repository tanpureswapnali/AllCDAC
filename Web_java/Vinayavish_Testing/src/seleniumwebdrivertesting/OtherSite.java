package seleniumwebdrivertesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherSite {

	public static void main(String[] args) {
		// Find total button
		System.setProperty("webdriver.chrome.driver","D:\\softwareengineering\\Testing-and-Integration\\LAB\\chromedriver_win32\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();
		 driver.navigate().to("https://vinayavish.com/user-account/");
		 List<WebElement> mylist = driver.findElements(By.xpath("//a"));
		 System.out.println("No of links--"+mylist.size());
		 
		 List<WebElement> mylist1 = driver.findElements(By.xpath("//button"));
		 System.out.println("No of button--"+mylist1.size());
		 
		 List<WebElement> mylist2 = driver.findElements(By.xpath("//textarea"));
		 System.out.println("No of textarea--"+mylist2.size());
		 
		 List<WebElement> mylist3 = driver.findElements(By.xpath("//input"));
		 System.out.println("No of input-box--"+mylist3.size());

	}

}
