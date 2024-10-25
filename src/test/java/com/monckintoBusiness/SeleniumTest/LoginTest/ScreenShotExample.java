package com.monckintoBusiness.SeleniumTest.LoginTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {
     public static void captureScreenshot(WebDriver driver,String filePath) {
    	 
    	 TakesScreenshot screenshot = (TakesScreenshot) driver;
    	 
    	 File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
    	 
    	 File destFile = new File(filePath);
    	 
    	 try {
    		 FileHandler.copy(srcFile, destFile);
    		 System.out.println("Scrennshot saved at: " + filePath);
    	 }catch(IOException e) {
    		 System.out.println("Error saving screenshot: " + filePath);

    	 }
    	 
    	 
     }
}
