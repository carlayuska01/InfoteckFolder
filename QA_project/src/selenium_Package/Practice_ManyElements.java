package selenium_Package;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_ManyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//https://hackernoon.com/recommended-websites-to-practice-selenium-and-test-automation
		driver.get("https://ultimateqa.com/complicated-page");
		
		driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Carla");
		driver.findElement(By.id("et_pb_contact_email_0")).sendKeys("carla@aol.com");
		driver.findElement(By.id ("et_pb_contact_message_0")).sendKeys("I am typing a message for Carla");
		
	    //Obtain the sum values 
		String sumvalues = driver.findElement(By.className("et_pb_contact_captcha_question")).getText();
		
		
		String [] arr = sumvalues.split(" ");
		
		//System.out.println(arr [0]);
		//System.out.println(arr [1]);
		//System.out.println(arr [2]);
		
		 String value1 = (arr [0]);
		 String value2 = (arr [2]);
		 
		 int val1 = Integer.parseInt(value1);
		 int val2 = Integer.parseInt(value2);
		 
		 int capint = val1 + val2; 
		 String capst = Integer.toString(capint);
		 
		 driver.findElement(By.name("et_pb_contact_captcha_0")).sendKeys(capst);
		//System.out.println(capst);
		 
		 driver.findElement(By.name("et_builder_submit_button")).click();
		 
	}

}
