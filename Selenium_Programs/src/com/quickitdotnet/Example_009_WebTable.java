package com.quickitdotnet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_009_WebTable {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver driver;

	public static void main(String[] args) {
		lauchbrowser();
		//tableselection();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		specificrow();
		
	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();

	}

	
	public static void tableselection() {
		// table/ tr/ td 
	WebElement  tabledata =	driver.findElement(By.tagName("table"));
	
	List<WebElement> totalRows    =  tabledata.findElements(By.tagName("tr"));
	
	for(WebElement rowData:totalRows) 
	{
		System.out.println(rowData.getText());
	}
	
		}
	
	
	public static void specificrow() {
		WebElement  tabledata =	driver.findElement(By.tagName("table"));
		
		WebElement singleRow    =  tabledata.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[31]"));
		
		
		System.out.println(singleRow.getText());
		
		WebElement columnValue    =  tabledata.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[31]/td[1]"+" "+ "//*[@id='leftcontainer']/table/tbody/tr[31]/td[3]"));
		
		
		System.out.println(columnValue.getText());
		
	 }
	}

