package Week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignment {
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		WebElement dropDownSix = driver.findElementByXPath("//option[text()='Select your programs']/parent::select");
		Select drop6 = new Select(dropDownSix);
		drop6.selectByIndex(2);
		Thread.sleep(30);
		System.out.println("Dropwdown is selected");
		driver.quit();
	}
}