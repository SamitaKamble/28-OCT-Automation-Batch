package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExamplewithoutDDF {

	public static void main(String[] args) {
		
		//1.Joh bhi classes and interface use kiya hai voh framework me use karna hai
		//2.Koi bhi apki method use karsakta hai esi method create karni padegi
		
		//IQ- Explain your FrameWork and rolles and resposibilities
		
		//Step1
		
		//4.15 version currently use kar rahe hai.
		//pahile 3.12 k version use karte the
		//First method to open browser:-
		//System.setProperty("Webdriver.chrome,driver","Parth of edriver");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Step3
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Enter username
		
		driver.findElement(By.xpath(null)).sendKeys(args);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
