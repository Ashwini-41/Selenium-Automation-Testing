package com.monckintoBusiness.SeleniumTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.monckintoBusiness.SeleniumTest.LoginTest.ScreenShotExample;

public class Robot_class {

	public WebDriver driver;
	
	@BeforeTest
	public void launch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
	}
	@Test
	public void using_robot_class() throws InterruptedException, AWTException {

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_W);
		robot.keyRelease(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);

		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
		
	}
	
	@Test
	public void robot_move() throws AWTException {
		WebElement ele = driver.findElement(By.id("email"));
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		
		Robot robot = new Robot();

		robot.mouseMove(x, y);
		robot.mouseWheel(2);

	}
	
	
	@Test 
	public void Take_ScreenShot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Sfile = ts.getScreenshotAs(OutputType.FILE);
		File Dfile = new File("C:/Users/ashwi/eclipse-workspace/SeleniumTest/src/test/java/com/loginpage.png");
		FileHandler.copy(Sfile, Dfile);
		driver.close();
		
	}
	
	
	
	
	@Test
	public void takeScreenshot() {
//		 ScreenShotExample.captureScreenshot(driver, "C:/Users/ashwi/OneDrive/Pictures/ScreenShot/facebook-login1.png");
		 ScreenShotExample.captureScreenshot(driver, "C:/Users/ashwi/eclipse-workspace/SeleniumTest/src/test/java/com/loginSS.png");

	}
}
