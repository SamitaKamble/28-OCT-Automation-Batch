package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentURL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String Expected_URL = "https://www.facebook.com";
		
		String Actual_URL = driver.getCurrentUrl();
		
		System.out.println(Actual_URL);
		
		if(Expected_URL.equals(Actual_URL)) {
			System.out.println("Correct URL");
			}else {
				System.out.println("InCorrect URL");
			}
		

	}

}
