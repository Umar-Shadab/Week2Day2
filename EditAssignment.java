package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditAssignment {
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByXPath("//label[text()='Enter your email address']/following::input").sendKeys("mohammedshadab41@gmail.com");
		System.out.println("Email Address has been entered");
		Thread.sleep(30);
		driver.findElementByXPath("//label[text()='Append a text and press keyboard tab']/following::input");
		System.out.println("Text has been appended");
		Thread.sleep(30);
		driver.findElementByXPath("//label[text()='Get default text entered']/following::input").getText();
		System.out.println("Text has been entered");
		Thread.sleep(30);
		driver.findElementByXPath("//label[text()='Clear the text']/following::input").clear();
		System.out.println("Text has been cleared");
		Thread.sleep(30);
		boolean e = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled();
		Assert.assertFalse(e);
		System.out.println("Text field has been disabled");
		Thread.sleep(30);
		driver.quit();
	}
}