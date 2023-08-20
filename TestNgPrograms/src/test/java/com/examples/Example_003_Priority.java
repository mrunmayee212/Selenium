package com.examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_003_Priority {

	WebDriver driver;

	@org.testng.annotations.Test(priority = 1)
	public void launchdriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();

	}

	@org.testng.annotations.Test(priority = 2)

	public void logout() {
		
	WebElement arrow =	driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
	arrow.click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	WebElement logOut = driver.findElement(By.linkText("Logout"));
	logOut.click();
	}

	@org.testng.annotations.Test(priority = 2)
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
