package module1.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram {

	public static void main(String[] args)
	
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://https://www.google.com/");
		driver.manage().window().maximize();
		//driver.switchTo().alert().accept()
		
		

	}

}
