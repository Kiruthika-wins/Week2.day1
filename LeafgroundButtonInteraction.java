package week2.day1.HomeAssignments;

import org.openqa.selenium.By;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafgroundButtonInteraction {

	public static void main(String[] args) {
						
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kiruthika_wins");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		
		WebElement dropdownElement = driver.findElement(By.name("industryEnumId"));
		Select options = new Select(dropdownElement);
		options.selectByIndex(2);
		
		WebElement dropdownElement1 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(dropdownElement1);
		option2.selectByVisibleText("Partnership");
		
		WebElement dropdownElement2 = driver.findElement(By.name("marketingCampaignId"));
		Select option3 = new Select(dropdownElement2);
		option3.selectByValue("CATRQ_AUTOMOBILE");
		
	
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String expectedTitle="Account Details | opentaps CRM";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("Title of the page is displayed correctly: "+ actualTitle);
		} else {
			System.out.println("Title mismatch. Expected: " + expectedTitle + ", but found: " + actualTitle);
		}
		
		driver.findElement(By.linkText("Logout"));
		
		    driver.close();
	}

}