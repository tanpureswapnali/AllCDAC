package seleniumwebdrivertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {

	public static void main(String[] args) {
		// Test to check Wrong Password
		System.setProperty("webdriver.chrome.driver","D:\\softwareengineering\\Testing-and-Integration\\LAB\\chromedriver_win32\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();

			driver.navigate().to("https://vinayavish.com/user-account");
			driver.findElement(By.name("login")).sendKeys("Swapnali");
	        
			driver.findElement(By.name("password")).sendKeys("Swapnali123");
			driver.findElement(By.xpath("//*[@id=\"stm-lms-login\"]/div[2]/div[3]/a")).click();


	}

}