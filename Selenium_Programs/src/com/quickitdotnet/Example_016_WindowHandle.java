package com.quickitdotnet;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Example_016_WindowHandle {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver driver;

	public static void main(String[] args) {
		lauchbrowser();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		windowHandle();

	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 
	}

	public static void windowHandle() {
		driver.findElement(By.xpath("//a[@class='newclose']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@class='newclose2']")).click();
		

	//Store the ID of the original window
	String originalWindow = driver.getWindowHandle();



	//Click the link which opens in a new window
	driver.findElement(By.xpath("//*[@id= 'loginId']/img")).click();

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	//Loop through until we find a new window handle
	for (String windowHandle : driver.getWindowHandles()) {
	    if(!originalWindow.contentEquals(windowHandle)) {
	        driver.switchTo().window(windowHandle);
	        break;
	    }
	}
	driver.switchTo().window(originalWindow);


	  
	
	}
	
	
}
	

