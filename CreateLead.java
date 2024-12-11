package week2.day1.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.className("inputBox")).sendKeys("Kiruthika's agro solutions");
		driver.findElement(By.name("firstName")).sendKeys("Naga Kiruthika");
		driver.findElement(By.name("lastName")).sendKeys("M");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Ms.");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		if(title.contains("Create Lead | opentaps CRM")) {
			System.out.println("The verified title is : " + title);
		}
		else { System.out.println("Title not verified");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.close();		

	}

}
