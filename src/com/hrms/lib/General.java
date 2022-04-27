package com.hrms.lib;
//import com.hrms.utility.log;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class General extends Global {
	    WebDriver driver;
	    
	public void LaunchUrl(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prash\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
       	driver.navigate().to(url);
       	Reporter.log("Application Opened");}
	
		
    public void addEmployee(String FirstName,String LastName) {
       	driver.findElement(By.xpath("//input[@onclick='returnAdd();']")).click();
    	driver.findElement(By.name(txt_LastName)).sendKeys(LastName);
    	driver.findElement(By.name(txt_FirstName)).sendKeys(FirstName);
    	driver.findElement(By.xpath("//input[@id='btnEdit']")).click();
    	Reporter.log("Employee added");
       	
        }
	public void login() {
		driver.findElement(By.name(txt_LoginName)).sendKeys(username);
		driver.findElement(By.name(txt_Password)).sendKeys(password);
		driver.findElement(By.name(btn_Login)).click();
		Reporter.log("logged in");}
	
	public void logOut() {
		driver.findElement(By.linkText(Logout)).click();
		Reporter.log("logged out");}
	
	public void deleteEmployee(String EmployeeID) {		
		driver.findElement(By.xpath("//input[@value='"+EmployeeID+"']")).click();
		driver.findElement(By.xpath("//input[@onclick='returnDelete();']")).click();
		Reporter.log("Employee deleted");
		}
	
	public void editEmployee(String EmployeeID,String Firstname,String Lastname) throws Exception {
		
		driver.findElement(By.xpath("//input[@value='"+EmployeeID+"']//parent::td//parent::td/following-sibling::td[2]/a")).click();
		driver.findElement(By.id(btn_Edit_Employee)).click();
		
		driver.findElement(By.name(txt_EditFirstName)).clear();
		driver.findElement(By.name(txt_EditLastName)).clear();
				
		driver.findElement(By.name(txt_EditFirstName)).sendKeys(Firstname);
		driver.findElement(By.name(txt_EditLastName)).sendKeys(Lastname);
		driver.findElement(By.id(btn_SaveCredentialsID)).click();
		Reporter.log("Employee edited");       	
	    }
	
	public void enterFrame() {
		driver.switchTo().frame(EnterFrame);
		Reporter.log("switched into frame");      	
	    }
	
	public void exitFrame() {
		driver.switchTo().defaultContent();	
		Reporter.log("exited from frame");   	
	    }

	public void CloseBroser() {
		driver.close();
		Reporter.log("Application closed");
		}		
}


