package com.monckintoBusiness.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
   
	
	@Test
	 public void loginpg() throws InterruptedException {
		 
		 driver = new EdgeDriver(); //Microsoft Edge browser
		 driver.get("https://www.facebook.com/login/");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();

		 driver.findElement(By.id("email")).sendKeys("ashwinihgarad41@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("12345678");
		 Thread.sleep(3000);
		 
//		 driver.findElement(By.linkText("Forgotten account?")).click(); //using linkText locator
		 driver.findElement(By.partialLinkText("Forgotten")).click(); // using partialLinkText locator
		 Thread.sleep(3000);
		 driver.findElement(By.id("identify_email")).sendKeys("ashwinihgarad41@gmail.com");
		 
		 driver.findElement(By.linkText("Cancel")).click();
		 Thread.sleep(1000);
		 
    }
	
	@Test
	public void signUppage() throws InterruptedException {
		driver = new ChromeDriver(); 
		 driver.get("https://www.facebook.com/login/");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.linkText("Sign up for Facebook")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.name("firstname")).sendKeys("Ashwini");
		 driver.findElement(By.name("lastname")).sendKeys("Garad");
		 
		 driver.findElement(By.name("birthday_day")).sendKeys("11");
		 driver.findElement(By.xpath("//select[@id='month']/option[9]")).click();
		 driver.findElement(By.name("birthday_year")).sendKeys("2002");
		 
		 driver.findElement(By.xpath("//label[text() = 'Male']")).click();
		 
		 driver.findElement(By.name("reg_email__")).sendKeys("ashwinihgarad41@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("ashwi@123");
		 Thread.sleep(3000);
//	     driver.findElement(By.linkText("Sign Up")).click();
	}
}
