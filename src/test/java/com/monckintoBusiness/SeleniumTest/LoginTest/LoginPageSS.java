package com.monckintoBusiness.SeleniumTest.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageSS {

	public static void main(String[] args) {
	
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://leap.himalayawellness.com/IOD/Account/Login");
//		 driver.get("https://www.facebook.com/login/");
		 //Thread.sleep(3000);
		 driver.manage().window().maximize();
//		 driver.getTitle();
		 driver.findElement(By.name("USERNAME")).sendKeys("ashwinihgarad41@gmail.com");
		 driver.findElement(By.name("PASSWORD")).sendKeys("12345678");
		 
		 ScreenShotExample.captureScreenshot(driver, "C:/Users/ashwi/OneDrive/Pictures/ScreenShot/login.png");
		 
		 driver.quit();
	}

}
