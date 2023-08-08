package com.quickitdotnet;

import java.nio.file.FileAlreadyExistsException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_005_DynamicId {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver browser;

	public static void main(String[] args) {
		launchBrowser();
		// 3 types of wait

		// Explicit wait => java Inbuilt wait Thread.sleep(5000);// 30 min
		// implicitwait =>// 20 min out + 5 min to prepare pizza + 5 min waiting time
		// fluentwait=> // 12 min + 5 min showroom + 5 min + 3min + 5 min // AJax
		// application
		// 23: 59:00

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

		browser.get("https://www.facebook.com/");
		browser.manage().window().maximize();
	}

	public static void login() {
		WebElement username = browser.findElement(By.id("email"));
		username.sendKeys("selenium@gmail.com");
		WebElement pwd = browser.findElement(By.name("pass"));
		pwd.sendKeys("selenium");
		pwd.clear();
		pwd.sendKeys("Test");
		//WebElement loginButton = browser.findElement(By.xpath("//button[@type='submit']"));
		//loginButton.click();
	}
}
