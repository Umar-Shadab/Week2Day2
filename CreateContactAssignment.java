package Week2.Day2;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactAssignment {

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
				
		driver.findElementByLinkText("Contacts").click();
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Create Contact").click();
		Thread.sleep(2000);
		
		driver.findElementById("firstNameField").sendKeys("Virender");
		Thread.sleep(2000);
		
		driver.findElementById("lastNameField").sendKeys("Sehwag");
		Thread.sleep(2000);
		
		driver.findElementById("createContactForm_firstNameLocal").sendKeys("Viru");
		Thread.sleep(2000);
		
		driver.findElementById("createContactForm_lastNameLocal").sendKeys("Pa Ji");
		Thread.sleep(2000);
		
		driver.findElementById("createContactForm_departmentName").sendKeys("MCA");
		Thread.sleep(2000);
		
		driver.findElementById("createContactForm_description").sendKeys("MCA Department 2010 - 2013 Batch");
		Thread.sleep(2000);
		
//		driver.findElementByClassName("primaryPhoneAreaCode").sendKeys("989");
//		Thread.sleep(2000);
//		
//		driver.findElementByClassName("primaryPhoneNumber").sendKeys("9894534236");
//		Thread.sleep(2000);
			
		driver.findElementById("createContactForm_primaryEmail").sendKeys("mohammedshadab41@gmail.com");
		Thread.sleep(2000);
		
		Select state= new Select(driver.findElementById("createContactForm_generalStateProvinceGeoId")); 
		state.selectByVisibleText("New York");
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Edit").click();
		Thread.sleep(2000);
		
		driver.findElementById("updateContactForm_description").clear();
		Thread.sleep(2000);
		
		driver.findElementById("updateContactForm_importantNote").sendKeys("This is an important notes section");
		Thread.sleep(2000);
		
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		Thread.sleep(2000);
		
		driver.findElementById("sectionHeaderTitle_contacts").getText();
		Thread.sleep(2000);
		
	driver.quit();
		
		
	}

}
