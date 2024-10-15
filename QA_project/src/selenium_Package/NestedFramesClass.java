package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.name("mytext1")).sendKeys("Carla");
		driver.switchTo().defaultContent();
		
	WebElement frame2=	driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.name("mytext2")).sendKeys("Yuska");
	}

}
