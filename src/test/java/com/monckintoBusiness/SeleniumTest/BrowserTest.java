package com.monckintoBusiness.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class BrowserTest {
	
 
 WebDriver driver;
 
 
 @Test
 public void methods() throws InterruptedException {
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/login/");
	 
	 //manage method
	 driver.manage().window().maximize();
	 
	 //getTitle() method 
	 String title = driver.getTitle();
	 System.out.println("********* Title of page is **********:"+ title);
	 Reporter.log("Title of page : " + title , true);

	 //getCurrentUrl()
	 String url = driver.getCurrentUrl();
	 System.out.println("***** Current url is ********* : "+ url);
	 Reporter.log("Current url is : "+ url,true);
	 
	 //navigate() method
	 driver.navigate().to("https://www.flipkart.com/");
	 Thread.sleep(3000);
	 
	 driver.navigate().back();
	 Thread.sleep(5000);
	 
	 driver.navigate().forward();
	 Thread.sleep(4000);
	 
	 //getPageSource() - Get the HTML source code of the current page
	 String getSource = driver.getPageSource();
	 System.out.println("******## Page Source is : ##*****:" +  getSource.length());
	 System.out.println();

	 //getWindowHandle() - Get the current window handle
	 String gethandle = driver.getWindowHandle();
	 System.out.println("************* Current window handle ****** :"+gethandle);
	 
	 //close method
	 driver.close();
 }
 
 
 @Test
 public void loginpg() throws InterruptedException {
	 
	 driver = new EdgeDriver(); //Microsoft Edge browser
	 driver.get("https://www.facebook.com/login/");
	 Thread.sleep(3000);
	 driver.manage().window().maximize();
	 driver.findElement(By.id("email")).sendKeys("ashwinihgarad41@gmail.com");
	 driver.findElement(By.name("pass")).sendKeys("12345678");
	 Thread.sleep(3000);
	 

 }
 
}
