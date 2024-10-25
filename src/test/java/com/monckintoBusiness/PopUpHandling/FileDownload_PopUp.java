package com.monckintoBusiness.PopUpHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileDownload_PopUp {

WebDriver driver;
	
//	@BeforeTest
//	public void Driver() {
//		driver = new ChromeDriver();
//	}
    
    @Test
    public void filedownload_example() throws InterruptedException {
    	driver = new FirefoxDriver();
//    	driver.get("https://www.google.co.in/");
    	/*
    	System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");

    	FirefoxProfile profile = new FirefoxProfile();

    	String key = "browser.helperApps.neverAsk.saveToDisk";
    	String value = "application/zip";
    	
    	profile.setPreference(key, value);
    	
    	// profile.setPreference("browser.download.dir", "D:\\Ajit\\Others");
    	profile.setPreference("browser.download.dir", "C:\\Users\\ashwi\\OneDrive\\Desktop");
    	//Use DesiredCapabilities class to modify the firefox settings as shown below
    	
    	DesiredCapabilities cap = DesiredCapabilities.firefox();
    	
    	cap.setCapability(FirefoxDriver.PROFILE, profile);
    	//Launch the firefox browser with the above modified settings
    	WebDriver driver = new FirefoxDriver(cap);
    	
    	//Enter selenium official website url
    	driver.get("http://www.seleniumhq.org/download/");
    	//Use following-sibling axes in Xpath to find the download link for selenium java
    	driver.findElement(By.xpath("//td[text()='Java']//following-sibling::td[3]/a")).click();
    	Thread.sleep(3000);
    	*/
//    	 System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");

         // Create a new Firefox profile and set preferences for file download
         FirefoxOptions options = new FirefoxOptions();
         options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
         options.addPreference("browser.download.dir", "C:\\Users\\ashwi\\OneDrive\\Desktop");
         options.addPreference("browser.download.folderList", 2); // 2 = custom location
         options.addPreference("browser.download.manager.showWhenStarting", false);
         options.addPreference("pdfjs.disabled", true); // Disable built-in PDF viewer

         // Initialize the WebDriver with FirefoxOptions
         WebDriver driver = new FirefoxDriver(options);

         // Navigate to Selenium's download page
         driver.get("http://www.seleniumhq.org/download/");

         // Locate and click on the download link for Selenium Java
         driver.findElement(By.xpath("//a[@class='card-link' and @href='https://www.nuget.org/packages/Selenium.WebDriver']")).click();

         // Wait for the download to start
         Thread.sleep(3000);

    }
}
