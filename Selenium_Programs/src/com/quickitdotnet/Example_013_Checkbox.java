package com.quickitdotnet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_013_Checkbox {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		lauchbrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		checkboxselection();

	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://accounts.practo.com/login?next=%2Fcheckid_request&intent=fabric");
		driver.manage().window().maximize();

	}

	public static void checkboxselection() {
	
WebElement check2 =   driver.findElement(By.xpath("//*[@id='login_form']/div/div[4]/div/div/label"));
  try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	check2.click(); {
		
		// isDisplay for checkbox
		System.out.println(check2.isDisplayed());
	}
	check2.click();
	System.out.println(check2.isDisplayed());
}
	}

	

