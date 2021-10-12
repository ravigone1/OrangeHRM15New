package  Day_009_ExtentReports;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

//step1
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport_AddEmploye
{
	
	WebDriver driver;
	
	//step2
	 ExtentTest logger;
	 ExtentReports extent;
	 String screenShotPath;
	 public static String TestScriptName = "TC01_Add_Employee";
	 public static String TestName;
	 
	 
	
	@Test
	public void Report3_Test() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
	// step3 start here - ExtendsHtmlReport starts
		 SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy_MMM_dd_h_mm_ss_SSS_a");
		 Date now = new Date();
		 String strDate = sdfDate.format(now);
		 
		 TestName=TestScriptName+"_"+strDate+".html";
		 TestScriptName=TestScriptName+"_"+strDate;
		 // String TestHtmlName="C:/HTML Report/test-output/ExtentReportScreenShots/"+ TestScriptName +"/"+TestName;
		  
		  String TestHtmlName="./ExtentReports/"+TestScriptName+".html";
		  
		
	 //String TestHtmlName=TestName;
		  
		 ExtentHtmlReporter reporter=new ExtentHtmlReporter(TestHtmlName);		 	 
		 extent=new ExtentReports();
		 extent.attachReporter(reporter);
		 logger=extent.createTest(TestName);
		 System.out.println("Html Report path is : "+TestHtmlName);	
		 
	 //step3 ends here ExtendsHtmlReport ends
		 
		 
		
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
	   
		enter(By.xpath(OR.username_sendkey)).sendKeys("Admin");
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Login Page - Entered user Name",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		

		enter(By.xpath(OR.password_sendkey)).sendKeys("admin123");	
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Login Page - Entered Password",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		
		enter(By.xpath(OR.login_click)).click();
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Login Page - Clicked on Login",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		enter(By.linkText("Admin")).click();
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Admin Page - Clicked on Login",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		
		enter(By.linkText("PIM")).click();
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Admin Page - Clicked on Login",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		
		enter(By.id("menu_pim_addEmployee")).click();
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Login Page - Clicked on Login",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		
		enter(By.id("firstName")).sendKeys("Rajesh");				
		enter(By.id("lastName")).sendKeys("Govind");
		
		String Photo ="C:\\Users\\HP\\Desktop\\Rajeshwari\\websit\\five.jpg";
		WebElement upload = enter(By.id("photofile"));
		upload.sendKeys(Photo);
		enter(By.id("chkLogin")).click();
		enter(By.id("user_name")).sendKeys("rajesh1848");
		enter(By.id("user_password")).sendKeys("Javi1848@");
		enter(By.id("re_password")).sendKeys("Javi1848@");
		
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Admin Page - Clicked on Login",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		enter(By.id("btnSave")).click();
		screenShotPath = ExtentReport.capture(driver,TestScriptName);
		logger.pass("Admin Page - Clicked on Login",MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath).build());
		
		
		//Step4
		extent.flush();
		
		
		driver.close();
	
	}
	
	
	

	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement enter(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		// draw a border around the found element
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
			
		
	
	
	
	
	
	
	
	
	
	
	
	

}












