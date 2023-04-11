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
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
//
	@Test
	public void logincheck()
	{
		
	driver.findElement(By.xpath("//div[@class=\"orangehrm-login-branding\"]")).isDisplayed();
	driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).isDisplayed();
	driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).isDisplayed();
		
	}

	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	
}
