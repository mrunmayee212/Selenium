package com.quickitdotnet;

import java.nio.file.FileAlreadyExistsException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_006_Implicitwait {
// implicitwait => is to tell WebDriver to poll the DOM for a certain amount of time when trying 
	// to find an element if they are immediately available.
	static WebDriver browser;

	public static void main(String[] args) {
		launchBrowser();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		login();
	}

	public static void launchBrowser() {

		browser = new ChromeDriver();

		browser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		browser.manage().window().maximize();
	}

	public static void login() {
		
		String expectedValidationMessage ="test";
		WebElement username = browser.findElement(By.name("username"));
		username.sendKeys("Admin");

		WebElement loginButton = browser.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();

		WebElement validationMessage = browser.findElement(
				By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
		String actualValidationMessage = validationMessage.getText();
		
		if(actualValidationMessage.equals(expectedValidationMessage)) {
			
			
			System.out.println("Validation is present");
		}
		else {
			System.out.println("wrong Validation");
		}

	}

}
