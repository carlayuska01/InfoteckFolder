package selenium_Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//Test site 
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
	
		Set<String> pw= driver.getWindowHandles();
		
		for(String window:pw)
		{
			
			driver.switchTo().window(window);
			if(driver.getTitle().equals("New Window"))
			{
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();
			}
		}
	}

}
