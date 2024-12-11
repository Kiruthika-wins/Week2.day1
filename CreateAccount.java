package week2.day1.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount{

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Kiruthika_1st_test");
		driver.findElement(By.name("description")).sendKeys("Hardwork never fails");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.id("numberEmployees")).sendKeys("1111");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		String title = driver.getTitle();
		if(title.contains("Account Details | opentaps CRM")) {
			System.out.println("The verified title is : " + title);
		}
		else { System.out.println("Title not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.close();	

	}

}
