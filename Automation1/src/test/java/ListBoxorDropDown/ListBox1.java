package ListBoxorDropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //implicit wait k vajese error nahi show karega
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sush");
		driver.findElement(By.name("lastname")).sendKeys("sawant");
		driver.findElement(By.name("reg_email_")).sendKeys("123456");
		driver.findElement(By.id("password_step_input")).sendKeys("@#$%^&ABc");
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[contains(text(),'10')]")).click();
		Thread.sleep(5000);
		driver.quit();
	
	}

}
