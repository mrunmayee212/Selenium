package com.quickitdotnet;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Example_015_Alert {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver driver;

	public static void main(String[] args) {
		lauchbrowser();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		//acceptAlert();

	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
		JavascriptExecutor	js =((JavascriptExecutor)driver);
		js.executeScript("window.scrollBy(0,300)");
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
	WebElement 	example = driver.findElement(By.xpath("/html/body/div/div[1]/div/main/div/p[2]/a"));
		example.click();
		Alert a = driver.switchTo().alert();
		//a.accept();
		a.dismiss();
	}

	
	
}
	

