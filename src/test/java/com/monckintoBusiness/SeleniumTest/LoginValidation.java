package com.monckintoBusiness.SeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginValidation {
	

	public WebDriver driver;
	
	@Test
	public void validation_login() {
		
		  driver = new ChromeDriver(); 
		  driver.get("https://www.facebook.com/"); 
		  WebElement unTB = driver.findElement(By.id("email")); 
		  
		  int username_Ycordinate = unTB.getLocation().getY(); 
		  System.out.println("***Email Y Co-ordinate is : "+ username_Ycordinate); 
		  WebElement pwdTB = driver.findElement(By.name("pass")); 
		  
		  int password_Ycordinate = pwdTB.getLocation().getY(); 
		  System.out.println("*** Password Y Co-ordinate is : " + password_Ycordinate); 
		  
		  if (username_Ycordinate==password_Ycordinate) { 
		     System.out.println("Both username and password fields are displayed in the same row"); 
		  }else{ 
		System.out.println("username and password fields are NOT aligned in the same row");
	     }
	}
	
	@Test
	public void methods_prac(){
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement unTB = driver.findElement(By.id("email"));
		int height_username = unTB.getSize().getHeight();
		int width_username = unTB.getSize().getWidth();
		
		System.out.println("*** Height of username field: " + height_username);
		System.out.println("*** Width of username field: " + width_username);
		
		WebElement pwdTB = driver.findElement(By.name("pass"));
		int height_pwd = pwdTB.getSize().getHeight();
		int width_pwd = pwdTB.getSize().getWidth();
		
		System.out.println("*** Height of password field: " + height_pwd);
		System.out.println("*** Width of password field: " + width_pwd);
		
		if( height_username == height_pwd && width_username == width_pwd) {
			System.out.println("Username and password fields are aligned");
			
		}else {
			System.out.println("Username and password fields are Not aligned");

		}
		
		
		
		

		
		
		
	}
}
