package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;


import com.hrms.utility.Log;


public class Private extends Public{
public	WebDriver driver;
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL8\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options); 
		//driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
		System.out.println("Application Opened");
		Reporter.log("Application Opened"); //htmlreport
		Log.info("Application Opened "); // logfile
	//	Reporter.log("Application opened");
	//	Log4j.inf("Application opened");
		}
		public void closeApplication() {
			
		    driver.close();
		    System.out.println("Application closed");
		    Log.info("Application closed ");
		  //  Log4j.inf("Application closed");
		}
		public  void login() {
		    driver .findElement(By.name(txt_loginname)).sendKeys(un);
		    driver.findElement(By.name(txt_password)).sendKeys(pw);
		    driver.findElement(By.name(btn_login)).click();
		    System.out.println("Login completed");
		    Log.info("Login completed ");
		 //   Log4j.inf("Login completed");
		   
		}
		public void logout() {
		    driver.findElement(By.linkText(link_logout)).click();
		    System.out.println("Logout completed");
		 //   Log4j.inf("Logout completed");
		    Log.info("Logout completed ");
		}
		public void enterFrame() {
		    driver.switchTo().frame(frame_empinfo);
		    System.out.println("entered into frame");
		}
		public void exitFrame() {
		    driver.switchTo().defaultContent();
		    System.out.println("exit from frame");
		}
		public void addNewEmp() {
		    driver.findElement(By.xpath(btn_Add)).click();
		    driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
		    driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
		    driver.findElement(By.id(btn_save)).click();
		    System.out.println("NewEmpAdded");
		}
		}



