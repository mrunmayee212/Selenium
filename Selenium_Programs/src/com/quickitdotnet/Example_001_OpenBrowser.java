/**
 * 
 */
package com.quickitdotnet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Admin
 *
 */
public class Example_001_OpenBrowser {
  // static => Sharable Object
	public static void main(String[] args) {
		launchBrowser();
	}

	// I want to open chrome Browser
	// In java Method name always be begin with smaller case
	// In .Net function name always begin with upper case
	public static void launchBrowser() {

		// WebDriver driver = new WebDriver();// you can not create copy of an interface
		// instantiation process is not possible in interface
		WebDriver browser = new ChromeDriver();
		
		//browser.get("http://www.makemytrip.com");
		browser.manage().window().maximize();
		browser.navigate().to("http://www.makemytrip.com");
		browser.navigate().to("http://www.amazon.com");
		browser.navigate().back();
		browser.navigate().forward();
		browser.navigate().refresh();
		

	}

}
