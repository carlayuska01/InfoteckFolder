package selenium_Package;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.qed42.com/");
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().to("https://www.twitter.com/");
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
	}

}
