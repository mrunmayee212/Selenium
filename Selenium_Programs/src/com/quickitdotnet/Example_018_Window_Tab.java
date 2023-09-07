package com.quickitdotnet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.browser.model.WindowState;

public class Example_018_Window_Tab {


	public static void main(String[] args) {
		lauchbrowser();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

	public static void lauchbrowser() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		
		
		driver.switchTo().newWindow(WindowType.TAB);// This will open window in next Tab
		
		driver.get("https://www.facebook.com");

		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.amazon.com");
	}
	
}
	

