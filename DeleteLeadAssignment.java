package Week2.Day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAssignment 
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElementById("username").sendKeys("demosalesmanager");
		Thread.sleep(2000);
		
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(2000);
		
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(2000);
		
		driver.findElementById("label").click();
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(2000);
		
		driver.findElementByClassName("selected").click();
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Phone").click();
		Thread.sleep(2000);
		
		WebElement countryCode=driver.findElement((By.id("createLeadForm_primaryPhoneCountryCode")));
		countryCode.clear();
		countryCode.sendKeys("5");
		
		driver.findElementByClassName("phoneAreaCode").sendKeys("989");
		Thread.sleep(2000);
		
		driver.findElementByClassName("phoneNumber").sendKeys("9894534236");
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(2000);
		
		
	}
}