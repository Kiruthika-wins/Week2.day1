package week2.day1.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown_FB {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Alice");		
		driver.findElement(By.name("lastname")).sendKeys("M");
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("19");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Nov");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1990");
		
		driver.findElement(By.name("reg_email__")).sendKeys("kiruthikawins@outlook.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//label[contains(text(),'FeMale')]/preceding-sibling::input")).click();		
		
	}

}
