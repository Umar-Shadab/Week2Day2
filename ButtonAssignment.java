package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAssignment {
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementById("position");
		System.out.println("Position button has been found");
		Thread.sleep(30);		
		
		driver.findElementById("color");
		System.out.println("Button color is Light Green");
		Thread.sleep(30);
		
		driver.findElementById("size");
		System.out.println("Button size has been found");
		Thread.sleep(30);
		
		driver.findElementById("home").click();
		System.out.println("Homepage is displayed");
		Thread.sleep(30);
		
		driver.quit();
	}
}