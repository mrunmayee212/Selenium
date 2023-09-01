package com.quickitdotnet;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example_014_RadioButton {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver driver;

	public static void main(String[] args) {
		lauchbrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		radioButtonSelection();

	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement signUp =driver.findElement(By.linkText("Create new account"));
         signUp.click();
	}

	public static void radioButtonSelection() {
	

	 WebElement femaleValue = driver.findElement(By.xpath("//*[contains(text(),'Female')]"));
	
	 WebElement maleValue = driver.findElement(By.xpath("//*[contains(text(),'Male')]"));
	 WebElement customValue = driver.findElement(By.xpath("//*[contains(text(),'Custom')]"));
	 
	 
	 femaleValue.click();
	 
	 System.out.println(femaleValue.isEnabled());
	 
	 maleValue.click();
	 System.out.println(maleValue.isEnabled());
	 
	 customValue.click();
	 System.out.println(customValue.isEnabled());
	 
	
	}
}
	

