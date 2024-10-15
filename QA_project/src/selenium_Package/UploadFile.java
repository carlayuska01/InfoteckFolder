package selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//Test site 
		driver.get("https://www.fileconvoy.com/index.php");
		
		
		//Upload file 
		WebElement upload_file = driver.findElement(By.xpath("//*[@id=\"upfile_0\"]"));
		
		upload_file.sendKeys("C:\\Users\\sgemi\\OneDrive\\Documents\\UploadTestDoco.txt");
		
		driver.findElement(By.id("readTermsOfUse")).click();
				
		driver.findElement(By.id("upload_button")).click();
	}

}
