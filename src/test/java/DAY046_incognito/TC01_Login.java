package DAY046_incognito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver;
	
	static String Admin_Xpath="//b[text()='Admin']",Nationalities_xpath="//b[text()='Nationalities']";
	
	@Test
	public void LoginTest() throws Exception
	{
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);
		
		/* 
			browse in private with Incognito mode -
			 Google Supporthttps://support.google.com › chrome › answer
			Incognito mode runs in a separate tab from your normal Chrome tabs. 
			If you have an Incognito tab open and 
			you open another one, your private browsing session will continue in the new tab. 
			To exit Incognito mode, close all Incognito tabs.
			 On your Android phone or tablet, open the Chrome app .
		 */
		
		
		
		
		
		
		
		driver.manage().window().maximize() ;
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath(Admin_Xpath)).click();
		driver.findElement(By.xpath(Nationalities_xpath)).click();
		
	}

}
