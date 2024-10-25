package com.monckintoBusiness.PopUpHandling;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	
	WebDriver driver;
	
	@BeforeTest
	public void Driver() {
		driver = new ChromeDriver();
	}
	@Test
	public void file_Upload() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='file'][@multiple='']")).sendKeys("C:\\Users\\ashwi\\Downloads\\Bitter truth.pdf");
		Thread.sleep(3000);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void fileUpload_use() throws InterruptedException, IOException {
		driver.get("https://smallpdf.com/pdf-converter");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
		Thread.sleep(5000);
		String command = "\"C:\\Users\\ashwi\\OneDrive\\Documents\\Web_Element\\FileUpload1.exe\"";
		Runtime.getRuntime().exec(command);
        Thread.sleep(3000);	
	}
}
