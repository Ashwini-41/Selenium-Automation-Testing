package com.monckintoBusiness.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	WebDriver driver;
	
	@Test
	public void Using_Webtable() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/ashwi/OneDrive/Documents/Web%20Element/tablePage.html");
		
		List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
		int totalRows = allRows.size();
		System.out.println("**** Total Number of rows of table are  : " + totalRows);
		
		List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
		int totalColumns = allColumns.size();
		System.out.println("**** Total Number of Columns of table are  : " + totalColumns);
		
		List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
		int totalCells = allCells.size();
		System.out.println("**** Total Number of Cells of table are  : " + totalCells);
		
		int countNumberValue = 0;
		int sum = 0;
		for(WebElement cell : allCells) {
			String cellValue = cell.getText();
			try {
				int number = Integer.parseInt(cellValue);
				
				System.out.println( " *** Number is : "+ number);
				countNumberValue++;
				sum = sum + number;
				
			}catch(Exception e) {
				
			}
		}
		
		System.out.println("**** Total count of numneric value is : " + countNumberValue);
		System.out.println("**** Total sum of all the numeric value is : " + sum );
		
			
		
	}
}
