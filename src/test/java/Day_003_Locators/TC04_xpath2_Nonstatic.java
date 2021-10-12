package Day_003_Locators;

import CommonUtil.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

import CommonUtil.TestBrowser;

public class TC04_xpath2_Nonstatic {
	
	
	static WebDriver driver;
	
	
	//*[@id='txtUsername']
	//*[@id='txtPassword']
	//*[@id='btnLogin']
	//*[@id='menu_admin_viewAdminModule']/b
	//*[@id='menu_admin_Organization']
	//*[@id='menu_admin_viewOrganizationGeneralInformation']
	
	 String  UserName="//*[@id='txtUsername']";
	 String  Password="//*[@id='txtPassword']";
	 String  Loginbutton="//*[@id='btnLogin']";
	 String  Admin="//*[@id='menu_admin_viewAdminModule']/b";
	 String  Organization="//*[@id='menu_admin_Organization']";
	 String  Generalinformation="//*[@id='menu_admin_viewOrganizationGeneralInformation']";

	 
  @Test
  public  void Test_xpath() throws Exception {
		
	  TC04_xpath2_Nonstatic T1 = new TC04_xpath2_Nonstatic();
	  T1.OpenChromeBrowser();
	  T1.OpenOrangeHRM();
	  T1.Login();
	  T1.Admin();
  }
  
  public  void OpenChromeBrowser() throws Exception {
	 
	  driver = TestBrowser.OpenChromeBrowser();
  }
  
  
public  void OpenOrangeHRM() throws Exception {
	
	String Test_URL="https://opensource-demo.orangehrmlive.com/";
		driver.get(Test_URL);
	  
  }
  
  
public  void Login() throws Exception {
	findElement(By.xpath(UserName)).sendKeys("Admin");
		findElement(By.xpath(Password)).sendKeys("admin123");
		findElement(By.xpath(Loginbutton)).click();
  
}
  

public  void Admin() throws Exception {
    
 	  findElement(By.xpath(Admin)).click();
		findElement(By.xpath(Organization)).click();
		findElement(By.xpath(Generalinformation)).click();  
}
  
  
  
  public  WebElement findElement(By by) throws Exception 
  {

  	WebElement elem = driver.findElement(by);  
  	
  	if (driver instanceof JavascriptExecutor) 
  	{
  	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
   
  	}
  	return elem;
}
}
