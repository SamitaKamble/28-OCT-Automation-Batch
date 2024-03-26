package IFRAME;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFRAME1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1
				WebDriverManager.chromedriver().setup(); // To open the browser
				//Step2
				WebDriver driver = new ChromeDriver(); // To open the browser
				//Step3
				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");// to open application using URL
				//Step 4
				//Main page
				Thread.sleep(5000);
				driver.manage().window().maximize();//to maximize the window
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				//To switch focus from mainpage to iframepage
				driver.switchTo().frame("iframeResult") ;
		// id="iframeResult" , id value sirf pass kiya hai isme
				
				driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
				boolean Test=driver.findElement(By.id("demo")).isDisplayed();
				//isDisplayed ka returnType is boolean
				
				if(Test == true) {
					System.out.println("Test is pass");
				}
				else {
					System.out.println("Test is failed");
				}
				
				driver.switchTo().defaultContent();
				//default content () firse mainpage pe leke jayega
				
				driver.findElement(By.id("tryhome")).click();
				//no such element exception ayega agar default switch nhi kiya toh

				System.out.println(" Execution completed");
				driver.close();
				
				
				
		
		
	}

}
