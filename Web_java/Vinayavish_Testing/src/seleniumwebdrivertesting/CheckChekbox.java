package seleniumwebdrivertesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckChekbox 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver","D:\\softwareengineering\\Testing-and-Integration\\LAB\\chromedriver_win32\\chromedriver.exe");
		  
         WebDriver driver = new ChromeDriver();
         driver.get("D:\\registration.html");
         List<WebElement> els = driver.findElements(By.xpath("//input[@type='checkbox']"));
 		
 		int chk = 0;
 		int unchk = 0;
 		
 		for(WebElement el : els)
 		{
 			if(el.isSelected())
 			{
 				chk++;
 			}
 			else
 			{
 				unchk++;
 			}
 			
 		}
 		System.out.println("Total Checked Items:" + chk);
 		System.out.println("Total Unchecked Items:" + unchk);

	}

}
