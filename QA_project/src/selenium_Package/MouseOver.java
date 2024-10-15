package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");

	FirefoxDriver driver= new FirefoxDriver();		
	driver.get("https://www.amazon.com/");
		
		WebElement mouseover = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		Actions mover = new Actions(driver);
		
		mover.moveToElement(mouseover).build().perform();
		
		
		
	}

}
