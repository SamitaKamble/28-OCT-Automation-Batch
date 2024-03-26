package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Facebook {
	
	public static void main(String[] args)  throws InterruptedException {
		
		//Step1
		
		WebDriverManager.chromedriver().setup();
		
		//Step2
		
		WebDriver driver = new ChromeDriver();
		
		//ChromeDriver driver1 = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		// xpath by attribute syntax - // tagname[@attribute name= "attribute value"]
		
		driver.findElement(By.xpath("//input[@id =\"email\"]")).sendKeys("samita.kamble.94@gmail.com");
		
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("samus@mu");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id=\"u_0_5_Vr\"]")).click();
		
		
		
		
		
		
		
	}

}
