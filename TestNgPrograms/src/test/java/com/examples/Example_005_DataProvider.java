package com.examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_005_DataProvider {
// TestNg parameters
	// TestNg with dataprovider
	
	// dp pass the different parameter on a single test
	
	WebDriver driver;
	
	
	@DataProvider(name = "data-set")
	public static Object[][] dataSet(){
		
		Object[][] obj = {
				
				
				{"valid","standard_user", "secret_sauce"},
				{"Invalid","standard_user", "secret_sauce123"}
		};
					
					
			
		
		
		return obj;
	}
		
		@Test(dataProvider = "data-set")
		public  void login(String type, String username, String password) {
			
			System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();

			 driver.get("https://www.saucedemo.com/");
			 WebElement uname = driver.findElement(By.xpath("//input[@id ='user-name']"));
				uname.sendKeys(username);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				WebElement pwd = driver.findElement(By.xpath("//input[@id ='password']"));
				pwd.sendKeys(password);

				WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
				loginButton.click();
				
				
		
			
		}
		}


