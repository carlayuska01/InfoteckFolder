package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rgtclick = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions ect = new Actions(driver);
		
		//Right click will perform on the mouse
		ect.contextClick(rgtclick).build().perform();
	}

}
