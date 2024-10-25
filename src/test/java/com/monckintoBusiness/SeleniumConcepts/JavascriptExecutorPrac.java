package com.monckintoBusiness.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorPrac {

	WebDriver driver;
	
	@Test
	public void Test_disabled_field() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/ashwi/OneDrive/Documents/demo.html");
		driver.findElement(By.id("t1")).clear();
		driver.findElement(By.id("t1")).sendKeys("Ashwini");
//		driver.findElement(By.id("t2")).sendKeys("Garad");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeScript("document.getElementById('t1').value='Ashwini'");
		js.executeScript("document.getElementById('t2').value=''");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('t2').value='Manager'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('t2').type='button'");

	}
	
	@Test
	public void ScrollUp_Function_And_MoveToElement() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -1000)");
		
	}
}
