package com.quickitdotnet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_007_Dropdown {
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
		driver.get("https://www.orangehrm.com/en/30-day-free-trial/");
		driver.manage().window().maximize();

	}

	// Select country using methods
	public static void selectvaluefromDropdown() {
		WebElement countryDropdown = driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(countryDropdown);
		// s.selectByVisibleText("Cuba");
		s.selectByValue("Haiti");
		s.selectByIndex(45);

	}

	// Get me the count of all Countries

	public static void getcountryCount() {

		/*
		 * List<WebElement> allList =
		 * driver.findElements(By.id("Form_getForm_Country"));
		 * System.out.println("Count of the countries in the dropdown are: "+
		 * allList.size());
		 */
		WebElement count = driver.findElement(By.id("Form_getForm_Country"));
		Select s1 = new Select(count);
		List<WebElement> countrycount = s1.getOptions();
		System.out.println(countrycount.size());
		for (WebElement countList : countrycount) {
			if (countList.getText().equals("Christmas Island")) {
				countList.click();
				break;
			}

			System.out.println(countList.getText());
		}
	}
}
