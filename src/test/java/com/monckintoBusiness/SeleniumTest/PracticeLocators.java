package com.monckintoBusiness.SeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeLocators {

	WebDriver driver;
	
	@BeforeTest
	public void launch() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void cssSelector_Prac() throws InterruptedException {
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("ashwinigarad11@gmail.com");
		driver.findElement(By.cssSelector("#email")).sendKeys("ashwinigarad098@gmail.com");
		driver.findElement(By.cssSelector("input[type='password'][id='pass']")).sendKeys("ashwi@345");
//		driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 inputtext _9npi inputtext _9npi\"]")).sendKeys("12345678");
		driver.findElement(By.cssSelector("a[class=\"_97w4\"]")).click();
		driver.findElement(By.cssSelector("input[type='text'][class=\"inputtext _9o1w\"]")).sendKeys("ashwini123@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[role='button'][href='/login.php']")).click();
		
	}
	
	@Test
	public void practice() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text() = 'Sign up for Facebook']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashwini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Garad");
		driver.findElement(By.xpath("//select[@id='day']/option[21]")).click();
		driver.findElement(By.xpath("//select[@id='year']/option[23]")).click();
		driver.findElement(By.xpath("//select[@id='month']/option[9]")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("//input[@type='text'][@name='reg_email__']")).sendKeys("ashwinigarad123@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"][@name='reg_passwd__']")).sendKeys("876543321");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Already')]")).click();
//		driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();
	}
	
	@Test
	public void groupIndex() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text() = 'Sign up for Facebook']")).click();
		
		//xpath axes
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println("***** List of days is : ***** " + list);
		
		driver.findElement(By.xpath("//select[@id='day']/child::option[11]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='day']/descendant::option[25]")).click();
		
		driver.findElement(By.xpath("//select[@id='month']/child::option[9]")).click();
		
		driver.findElement(By.xpath("//select[@id='year']/option[24]/preceding-sibling::option[1]")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//select[@id='year']/option[22]/following-sibling::option[3]")).click();
        Thread.sleep(5000);
//		driver.close();
	}
}
