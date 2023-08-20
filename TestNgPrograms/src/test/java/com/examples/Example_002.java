package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Example_002 {    

	


	  @Test 

	  public void createDriver() {     
		 System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
			
			
		 
		WebDriver  driver = new ChromeDriver();
		 driver.get("http://www.google.com");   
		 
		 
	  }    





	 

	}

