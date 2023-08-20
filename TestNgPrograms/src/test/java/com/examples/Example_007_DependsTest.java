package com.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_007_DependsTest {

	WebDriver driver;
	

  
	@Test
	public void launchdriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
  

	@Test(dependsOnMethods = {"login"})
	public void checkTitle() {
		String testTitle = "OrangeHRM";
	String originalTitle = "OrangeHRM";
		Assert.assertEquals(originalTitle, testTitle);
	}


	@Test(dependsOnMethods = {"launchdriver"})
	public void login() {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
		username.sendKeys("Admin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement pwd = driver.findElement(By.xpath("//input[@name ='password']"));
		pwd.sendKeys("admin123");

		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
