package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.itlearn360.com/");	
		boolean cn=driver.findElement(By.xpath("//*[@id=\"plans\"]/li[1]/ul/li[4]/a")).isEnabled();
		
		if(cn)
		{
			System.out.println("Button is Enaled");
		}
		else
		{
			System.out.println("Button is disabled");
		}
		
		driver.close();
	}

}
