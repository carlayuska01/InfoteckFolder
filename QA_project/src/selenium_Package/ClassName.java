package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");	
		
		driver.findElement(By.className("gLFyf")).sendKeys("Vanilla Cookies");
		driver.findElement(By.className("gNO89b")).click();
		
	}

}
