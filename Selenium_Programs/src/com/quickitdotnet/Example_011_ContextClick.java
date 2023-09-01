package com.quickitdotnet;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

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

public class Example_011_ContextClick {
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
		rightClick();

		

	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();

	}

	public static void rightClick() {
	
	
     Actions act = new Actions(driver);
     By rightButton =	By.cssSelector(".context-menu-one");
     //fluent wait
     
     WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(5));//Fluent wait
     
     wait.until(ExpectedConditions.presenceOfElementLocated(rightButton));
     
   WebElement rightSuggestion =  driver.findElement(rightButton);
     act.contextClick(rightSuggestion).build().perform();
     
  WebElement getPasteText =   driver.findElement(By.cssSelector(".context-menu-icon-paste"));
  
  String pasteText = getPasteText.getText();
  System.out.println(pasteText);
  getPasteText.click();

	}

	}

