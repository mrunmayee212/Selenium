package com.quickitdotnet;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_010_TakeScreenshotview {
// Object Spy => To locate Web Element 
	// WebElement => The position of GUI Element
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		lauchbrowser();
		tableselection();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void lauchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();

	}

	public static void tableselection() throws IOException {
		// table/ tr/ td
		WebElement company = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]/a"));
		company.click();
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destFile = "E:\\mrunumi\\Screenshot\\abc.jpg";
		FileHandler.copy(srcfile, new File(destFile));

	}

}
