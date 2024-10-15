package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingHM2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://training.qaonlinetraining.com/testPage.php");
		driver.findElement(By.name("name")).sendKeys("Carla");
		driver.findElement(By.name("email")).sendKeys("Carla@gmail.com");
		driver.findElement(By.name("website")).sendKeys("https://carla.com");
		driver.findElement(By.name("comment")).sendKeys("Comment 1");

		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.name("bike")).click();
		driver.findElement(By.name("car")).click();
		driver.findElement(By.name("boat")).click();
		driver.findElement(By.name("horse")).click();

		// dropdown with one selection
		WebElement cn = driver.findElement(By.name("country"));
		Select coun = new Select(cn);
		coun.selectByVisibleText("Ethiopia");
		Thread.sleep(4000);
		
		//dropdown with multiple selections
		WebElement sk = driver.findElement(By.name("skill"));
		Select field = new Select(sk);
		field.selectByVisibleText("Programming");
		field.selectByVisibleText("Database");
		Thread.sleep(4000);

		driver.findElement(By.className("special")).click();
	}

}
