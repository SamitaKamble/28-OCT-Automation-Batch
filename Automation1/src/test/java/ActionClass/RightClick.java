package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1
		WebDriverManager.chromedriver().setup();
		
		//Setp2
		WebDriver driver = new ChromeDriver();
		
		//Step3
		driver.manage().window().maximize();
		
		//Step4
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement RightC = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));

		//Diff b/w Action and Actions ?
		//Action is a Interface and Actions is a class
		
		Actions act = new Actions(driver); //driver ka reference pass karna padega
		//Input Parameter of Actiona class is WebDriver driver
		
		act.contextClick(RightC).build().perform();
		//Build means Action create hogi backend me
		//perform means action perform hogi
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Copy')][2]")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String Text=alt.getText(); //To fetch the text "clicked: copy"
		System.out.println(Text);
		
		alt.accept();//click on OK method
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
