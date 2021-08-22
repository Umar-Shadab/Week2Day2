package Week2.Day2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkAssignment {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Home Page has been displayed");
		driver.navigate().back();
		Thread.sleep(30);
		
		driver.findElementByLinkText("Find where am supposed to go without clicking me?").click();
		System.out.println("Supposed Page has been displayed");
		driver.navigate().back();
		Thread.sleep(30);	
		
		driver.findElementByLinkText("Go to Home Page").click();
		System.out.println("Interact with same link name");
		driver.navigate().back();
		Thread.sleep(30);
		
		List<WebElement> links = driver.findElements(By.linkText("How many links are available in this page?"));
	    System.out.println("The number of links is " + links.size());
		Thread.sleep(30);
		
		driver.findElementByLinkText("Verify am I broken?").click();
		Thread.sleep(30);
		HttpURLConnection huc = null;
		Object url = null;
		huc = (HttpURLConnection)(new URL((String) url).openConnection());
		int respCode = huc.getResponseCode();
		
		if(respCode >= 404){
			System.out.println(url+" is a broken link");
			}
			else{
			System.out.println(url+" is a valid link");
			}
		
		driver.quit();
	}
}