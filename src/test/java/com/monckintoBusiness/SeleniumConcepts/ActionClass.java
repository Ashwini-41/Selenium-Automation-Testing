package com.monckintoBusiness.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ActionClass {
	
	WebDriver driver;

	@BeforeTest
	public void Driver() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void Using_contextClick() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement pass2 = driver.findElement(By.xpath("//input[@id='email']"));

		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		
		actions.contextClick(pass2).perform();
			
		Thread.sleep(3000);
		actions.contextClick(pass).perform();		
		
	}
	
	@Test
	public void Using_DragAndDrop() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(source).clickAndHold().perform();	
		
		action.release(des).perform();
	}
	
	@Test
	public void Using_Google_ShortCut() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.name("q"));
		Actions action = new Actions(driver);
		action.sendKeys("What is Selenium ?").perform();
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys("A").perform();
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
		
		
		
		
	}
	
	
}
