package com.quickitdotnet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_008_Dropdown2 {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver driver;

	public static void main(String[] args) {
		lauchbrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// selectvaluefromDropdown();
		getcountryCount();
	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();

	}

	// Select country using methods
	public static void selectvaluefromDropdown() {
		WebElement countryDropdown = driver.findElement(By.xpath("//div[@class='c-omni-suggestion-list']"));
		Select s = new Select(countryDropdown);
		s.selectByVisibleText("Dermatologist");
		

	}

	// Get me the count of all Countries

	public static void getcountryCount() {

		/*
		 * List<WebElement> allList =
		 * driver.findElements(By.id("Form_getForm_Country"));
		 * System.out.println("Count of the countries in the dropdown are: "+
		 * allList.size());
		 */
		
		WebElement  searchpanel = driver.findElement(By.xpath("//input[@placeholder='Search doctors, clinics, hospitals, etc.']"));
		searchpanel.sendKeys("Dentist");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement>search = driver.findElements(By.xpath("//div[@class='c-omni-suggestion-list']"));
		
		for(int i=0; i<search.size(); i++) {
			System.out.println(search.get(i).getText());
		}
		
			
		}
	}

