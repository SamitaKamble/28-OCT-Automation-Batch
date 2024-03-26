package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 
 

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions(); 
		co.setBrowserVersion("117");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        
        
        
	}

}
