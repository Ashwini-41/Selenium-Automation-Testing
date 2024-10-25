package com.monckintoBusiness.PopUpHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutor_PopUp {
WebDriver driver;
	
	@BeforeTest
	public void Driver() {
		driver = new ChromeDriver();
	}  
	
	@Test
	public void simple_alert() throws InterruptedException {

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
        Thread.sleep(3000);

		//driver.findElement(By.id("timerAlertButton")).click();
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		alert.accept(); 
		
	}
	
	@Test
	public void alert_popup() throws InterruptedException {
		
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php"); 
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click(); 
		Thread.sleep(3000); 
		
		Alert alert = driver.switchTo().alert(); 
		Thread.sleep(3000); 
		
		System.out.println(alert.getText()); 
		Thread.sleep(3000); 
		
		alert.sendKeys("Ashwini"); 
		Thread.sleep(3000); 
		
		alert.accept(); 
		Thread.sleep(3000); 
		
		System.out.println(alert.getText()); 
		alert.dismiss();
	}
	
	@Test
	public void Confirmation_PopUp() throws InterruptedException {
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
        Thread.sleep(3000);
        alert.dismiss();
        Thread.sleep(3000);
        
		
	}
	
	
	
}
