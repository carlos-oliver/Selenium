package Testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoWebAlert {
	WebDriver driver;
	
	public DemoWebAlert(){
	}
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		driver.get("file:///C:/Selenium/Testing/AlertsPopups/PaginaTeste2.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void testWebAlert() throws InterruptedException {
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		}
	
		@After
		public void tearDown(){
		driver.quit();
	
	} 
}
