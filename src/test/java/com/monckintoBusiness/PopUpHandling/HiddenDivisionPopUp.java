package com.monckintoBusiness.PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HiddenDivisionPopUp {

WebDriver driver;
	
	@BeforeTest
	public void Driver() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void hiddenDivisionPopUp_Example() throws InterruptedException {
        driver.get("https://www.expedia.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@name = 'EGDSDateRange-date-selector-trigger']")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='29'][@class='uitk-date-number uitk-date-number-default uitk-type-300 uitk-type-regular']")).click();
        
        Thread.sleep(5000);
        driver.close();
	}
}
