package Clo;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Autosite {
	private static WebDriver driver;
	@BeforeMethod
	public void browselaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//WebDriverWait w=new WebDriverWait(driver,60);
	}
//
//	@Test
//	public void logincheck()
//	{
//		WebElement title=driver.findElement(By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]"));
//		//Assert.assertEquals(title.getText(),"Login");
//		Assert.assertTrue(title.isDisplayed());
//		//check username field exist
//	//	driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
//		//driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).isDisplayed();
//		//driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).isDisplayed();
//		
//	}
	@Test
	public void insertvalue() throws AWTException, InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		driver.findElement(By.className("oxd-main-menu-item-wrapper")).click();
		//add user
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text-input\"]")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("a");
		Thread.sleep(10000);
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r2.keyPress(KeyEvent.VK_ENTER);
		//password
		List <WebElement> li=driver.findElements(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]"));
		li.get(1).sendKeys("Gaurav");
		li.get(2).sendKeys("Gaurav@2756");
		li.get(3).sendKeys("Gaurav@2756");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).click();
	
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
		//Save
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		
		
		
		
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		//driver
		//.close();
	}
	
}
