package seleniumwebdrivertesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboBox {

	public static void main(String[] args) {
		// Test to check Combobox
		System.setProperty("webdriver.chrome.driver","D:\\softwareengineering\\Testing-and-Integration\\LAB\\chromedriver_win32\\chromedriver.exe");
		  
        WebDriver driver = new ChromeDriver();
         driver.get("https://sumitnce1.github.io/Web-Programming-Technologies/Day9/Assignment9/Js_Assignment9-4.html");
		
		Select se = new Select(driver.findElement(By.xpath("//Select[@id='pizzasauce']")));
		
		List<WebElement> myselectlist = se.getOptions();
		
		System.out.println("Total no. of Items:" + myselectlist.size());
		
		for(int i=0;i<myselectlist.size();i++)
		{
			String elementText = myselectlist.get(i).getText();
			
			System.out.println(elementText);
			
		}

	}

}
