package com.monckintoBusiness.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectClass {
   static WebDriver driver;
   @Test
   public void Using_SelectClass_Method() {
   
//	 public static void main(String[] args) {  
	   driver = new ChromeDriver();
	   driver.get("file:///C:/Users/ashwi/OneDrive/Documents/Web%20Element/selectTagPage.html");
       WebElement list = driver.findElement(By.id("mtr"));
       
       Select s = new Select(list);
       
       List<WebElement> options = s.getOptions();
       int size = options.size();
       System.out.println("Number of elements present inside the listbox is : "+ size);
       
       for(WebElement webEle : options) {
    	   String text = webEle.getText();
    	   System.out.println(text);
       }
       
       
       s.selectByIndex(0);
       
       s.selectByValue("o");
       
       s.selectByVisibleText("Orange");
       
       System.out.println("**** Print all selected options *** ");
       List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
       
       int size2 = allSelectedOptions.size();
       System.out.println("Number of items that is selected in the list box is : "+size2);
      
       System.out.println("Selected items are printed below ");
       for(WebElement webEle : allSelectedOptions) {
    	   System.out.println(webEle.getText());
       }
       
    
       
   }
}
