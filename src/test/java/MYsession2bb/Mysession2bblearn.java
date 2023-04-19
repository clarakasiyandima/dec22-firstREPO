package mysession2bb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mysession2bblearn {
	
	WebDriver driver;
	
	@Before
 public void init() {
	 
	 System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	 
	 driver.manage().deleteAllCookies();
	 driver.get("https://techfios.com/billing/?ng=admin/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
 }
	@Test
 public void testlocators() {
		driver.findElement(By.name("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Bank & Cash")).click();
		driver.findElement(By.linkText("New Account")).click();
	 driver.findElement(By.name("account")).sendKeys("clara kasiyandima");
	 driver.findElement(By.name("description")).sendKeys("December 2022 tuition fees");
driver.findElement(By.name("account_number")).sendKeys("1579028");
  driver.findElement(By.name("contact_person")).sendKeys("clara kasiyandima");
  driver.findElement(By.name("contact_phone")).sendKeys("8622141799");
	}
	//@After
	public void tearDown() {
	driver.close();
	driver.quit();
	}
}
