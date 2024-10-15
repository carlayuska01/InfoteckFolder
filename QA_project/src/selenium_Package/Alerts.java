package selenium_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://training.qaonlinetraining.com/testPage.php");
		
		//maximize the window
		driver.manage ().window().maximize();
		
		driver.findElement(By.id("alert")).click();
		Alert aler=driver.switchTo().alert();
		aler.accept();
		Thread.sleep(4000);
		
		driver.findElement(By.id("confirm")).click();
		Alert confir=driver.switchTo().alert();
		confir.dismiss();
		
		Thread.sleep(4000);
		driver.findElement(By.id("prompt")).click();
		Alert promp=driver.switchTo().alert();
		promp.sendKeys("Carla Yuska");
		Thread.sleep(4000);
		promp.accept();
		
		
		
	}

}
