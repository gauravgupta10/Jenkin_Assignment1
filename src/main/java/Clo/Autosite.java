package Clo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autosite{

private static WebDriver driver;

	@BeforeMethod
	public void lauch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gauran Gupta\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://mathsolver.microsoft.com/en");
		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		  
	}
       
		@Test
		public void Home() throws InterruptedException 
		{
			
			driver.findElement(By.xpath("//button[@aria-label=\"7\"]")).click();
			driver.findElement(By.xpath("//button[@aria-label=\"Add\"]")).click();
			driver.findElement(By.xpath("//button[@aria-label=\"7\"]")).click();
			Thread.sleep(4000);
			System.out.println(driver.findElement(By.xpath("//div[@class=\"GuppyField_ia__128DY\"]")).getText());
			
			
			
		}
		
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}