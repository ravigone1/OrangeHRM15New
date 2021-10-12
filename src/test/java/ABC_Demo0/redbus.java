package ABC_Demo0;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class redbus {
	WebDriver driver;
  @Test
  public void ticket_book()throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(" https://www.redbus.in/bus-tickets");
	  
	  driver.findElement(By.id("txtSource")).sendKeys("Hyderabad");
	  driver.findElement(By.id("txtDestination")).sendKeys("Warangal");
	  driver.findElement(By.id("txtOnwardCalendar")).click();
	  driver.findElement(By.xpath("rb-month")).click();
	//*[@id="rb-calmiddle"]/ul[2]/li[19]/span
	  
	//String str = "//*[@id='rb-calmiddle']/ul[2]/li[25]/span";
	driver.findElement(By.xpath("//*[contains(@span,) and text()='" +17+"']")).click();
	//*[contains(@href,'#') and text()='" + 23 +"']";
	driver.findElement(By.xpath("D120_search_btn searchBuses")).click();
	
	  
	
	  
  }
}
