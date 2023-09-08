package seleniumwebdrivertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register 
{

	public static void main(String[] args) 
	{
		// Test check for register
		System.setProperty("webdriver.chrome.driver","D:\\softwareengineering\\Testing-and-Integration\\LAB\\chromedriver_win32\\chromedriver.exe");
		  
		 WebDriver driver = new ChromeDriver();

			driver.navigate().to("https://vinayavish.com/user-account");
			driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[1]/div[1]/div/input")).sendKeys("Swap");
			driver.findElement(By.name("email")).sendKeys("sarode@gmail.com");
	        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[2]/div[1]/div/input")).sendKeys("Ritika@1234");
	        driver.findElement(By.name("password_re")).sendKeys("Ritika@1234");
	        driver.findElement(By.xpath("//*[@id=\"stm-lms-register\"]/form/div[4]/div/div/button/span")).click();

	}

}
