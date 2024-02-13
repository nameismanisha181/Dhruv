package selenium_Maven_Project.TDDandBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tester3 {

	WebDriver driver;
	@Test
	public void demo() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(4000);
		Assert.assertEquals(driver.getTitle(), "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM");
		System.out.println("Done tester3");
		
	}
}
