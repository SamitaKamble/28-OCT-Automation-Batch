package Screenshots;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Screenshot3 {

	public static void main(String[] args) throws IOException {
		
		// to take screenshot of particular Logoname of Image
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement FacebookLogo=driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		//Returntype of FindElement is webElement, and webelement ka refcariable name FacebookLogo hai
		
		//File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//driver reference means ye pura page la ss lega but humko sirf FacebookLogo ka ss 
		//chahiye toh  driver k jagah FacebookLogo logo ref dalna padega
		
		File Source =((TakesScreenshot)FacebookLogo).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(5);
		String Facebook = "FacebookLogo";   //File ka name store kiya hai FacebookLogo
		
		File Dest = new File("C:\\Users\\samit\\Desktop\\Selenium Screenshot\\New Files/"+Facebook+"_"+Random+".png");
		
		FileHandler.copy(Source, Dest);
		
		driver.close();

	}

}
