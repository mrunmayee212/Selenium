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

public class Example_012_FindingAllLinks {
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
		

		getAllLinks();

	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.practo.com/");
		driver.manage().window().maximize();

	}

	public static void getAllLinks() {
	
List<WebElement> alllinks =	 driver.findElements(By.tagName("a"));

for(WebElement getLinks :alllinks) {
	System.out.println(getLinks.getText());
	
}
	}

	}

