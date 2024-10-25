package com.monckintoBusiness.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Frames {

	WebDriver driver;
	
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void Frames_Function() throws InterruptedException {
		driver.get("file:///C:/Users/ashwi/OneDrive/Documents/Web%20Element/page2.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Ashwini");
		driver.findElement(By.id("t3")).sendKeys("12345");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("t2")).sendKeys("Garad");
		Thread.sleep(4000);
		
		//using id attribute of the frame -string 
		
		driver.switchTo().frame("f1"); 
		driver.findElement(By.id("t1")).sendKeys(" ashwini"); 
		driver.switchTo().defaultContent(); 
		driver.findElement(By.id("t2")).sendKeys(" garad"); 
//		driver.close(); 
		
	}
}
