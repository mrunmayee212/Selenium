/**
 * 
 */
package com.quickitdotnet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Admin
 *
 */
public class Example_002_Switchcase {
  // static => Sharable Object
	 static WebDriver driver;
	public static void main(String[] args) {
		openBrowser("Edge");
	}	
	public static void openBrowser(String browserType) {
		
		switch (browserType) {
		case "Chrome":
			driver = new ChromeDriver();
			break;

		case "Edge":
			driver = new EdgeDriver();
			break;
		case "FF":
			
			driver = new FirefoxDriver();
			break;

		default:
			driver = new InternetExplorerDriver();
			break;
		}
	}
	
	

}
