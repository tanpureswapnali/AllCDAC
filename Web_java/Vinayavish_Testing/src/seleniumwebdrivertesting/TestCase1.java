package seleniumwebdrivertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 
{

	public static void main(String[] args) 
	{
		//This is test case for opening a website and searching
		
         System.setProperty("webdriver.chrome.driver","D:\\softwareengineering\\Testing-and-Integration\\LAB\\chromedriver_win32\\chromedriver.exe");
	  
         WebDriver driver =new ChromeDriver();
	   
         driver.navigate().to("https://www.google.com/");
         
         driver.findElement(By.name("q")).sendKeys("Prof. Ajit Vishwarma");
	
         driver.findElement(By.name("btnK")).submit();
	
	}

}
