package com.microsoft.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	
	private By firstname=By.id("usernamereg-firstName");
	private By lastname=By.id("usernamereg-lastName");
	private By username=By.id("usernamereg-yid");
	private By password=By.id("usernamereg-password");
	private By mobileno=By.id("usernamereg-phone");
	private By dob_month=By.id("usernamereg-month");
	private By dob_day=By.id("usernamereg-day");
	private By dob_year=By.id("usernamereg-year");
	private By btncontinue=By.id("reg-submit-button");
	
	
	
    public void DoSomething(boolean flag){
        if(flag){
            System.out.println("I am covered");
            return;
        }

        System.out.println("I am not covered");
    }
    public static WebDriver driver;
    
    public void LaunchBrowser() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Raunak\\Downloads\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	
    }
    public void NavigateToApplication() {
    	driver.navigate().to("https://login.yahoo.com/account/create");
    	
    }
    public void EnterData() throws InterruptedException {
    	Thread.sleep(5000);
    	driver.findElement(firstname).sendKeys("ABC");
    	Thread.sleep(5000);
    	driver.findElement(lastname).sendKeys("BHHJ");
    	Thread.sleep(5000);
    	driver.findElement(username).sendKeys("jhjbhkjsdkjnfksjbk");
    	Thread.sleep(5000);
    	driver.findElement(username).sendKeys(Keys.TAB);
    	//driver.findElement(username).click();
    	Thread.sleep(5000);
    	driver.findElement(password).sendKeys("Testing@1");
    	Thread.sleep(5000);
    	driver.findElement(mobileno).sendKeys("9877665540");
    	Thread.sleep(5000);
    	Select select=new Select(driver.findElement(dob_month));
    	select.selectByIndex(1);
    	Thread.sleep(5000);
    	driver.findElement(dob_day).sendKeys("12");
    	Thread.sleep(5000);
    	driver.findElement(dob_year).sendKeys("1990");
    	Thread.sleep(5000);
    	//click on continue
    	driver.findElement(btncontinue).click();
    	
    	
    	
    	
    }
    public void CloseDriver() {
    	driver.close();
    	driver.quit();
    }
    
    
    
}
