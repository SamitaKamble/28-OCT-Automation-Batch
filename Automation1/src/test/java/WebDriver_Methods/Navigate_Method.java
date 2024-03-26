package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		//navigate me koi parameter nahi daal sakte to to use karke string parameter dal sakte
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String Title1 = driver.getTitle();
		//to fetch title
		System.out.println(Title1);
		
		//abhi same page k upar amzon ki page open karni hai
		
		driver.navigate().to("https://www.amazon.in/");
		String Title2 = driver.getTitle();
		
		Thread.sleep(5000);
		System.out.println(Title2);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.quit();

	}

}
