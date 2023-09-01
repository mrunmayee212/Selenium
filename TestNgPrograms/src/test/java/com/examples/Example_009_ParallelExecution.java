package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_009_ParallelExecution {

	WebDriver driver;
	

  
	@Test
	public void launchdriver() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();

		 driver.get("https://www.saucedemo.com/");
		 WebElement uname = driver.findElement(By.xpath("//input[@id ='user-name']"));
			uname.sendKeys("standard_user");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement pwd = driver.findElement(By.xpath("//input[@id ='password']"));
			pwd.sendKeys("secret_sauce");

			WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
			loginButton.click();
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
