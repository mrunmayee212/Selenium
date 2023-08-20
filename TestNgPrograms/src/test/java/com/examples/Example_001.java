package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_001 {
 
	
	@Test
  public void Testme() {
	  System.out.println("I am working");
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		
		/*
		 * ChromeOptions op = new ChromeOptions(); op.setBinary(
		 * "C:\\Users\\Admin\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		 * 
		 */
	 
	WebDriver  driver = new ChromeDriver();
	 driver.get("http://www.google.com");  
  }
}
