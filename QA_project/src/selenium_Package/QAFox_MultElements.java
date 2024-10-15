package selenium_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAFox_MultElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//Test site 
		driver.get("https://omayo.blogspot.com/");
		//maximize the window
		driver.manage ().window().maximize();
		
		//Multi Selection Box
		WebElement multselbox = driver.findElement(By.id("multiselect1"));
		Select mselbox = new Select(multselbox);
		mselbox.selectByVisibleText("Hyundai");
		mselbox.selectByVisibleText("Audi");
		
		//Checkbox select item blue
		driver.findElement(By.id("checkbox2")).click();
		
		//Alert-SIMPLE with accept ok button on
		driver.findElement(By.id("alert1")).click();
		Alert aler1=driver.switchTo().alert();
		Thread.sleep(4000);
		aler1.accept();
		
		
		//Alert-PROMPT with Ok/Cancel and enter text
		driver.findElement(By.id("prompt")).click();
		Alert aler2 = driver.switchTo().alert();
		aler2.sendKeys("Carla Yuska");
		aler2.accept();
				
		//Alert - CONFIRM OK and Cancel buttons only
		driver.findElement(By.id("confirm")).click();
		Alert aler3 = driver.switchTo().alert();
		Thread.sleep(4000);
		aler3.dismiss();
		
		
		
		
		
	}

}
