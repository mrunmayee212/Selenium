package com.quickitdotnet;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_011_ReadDatafromproperties {

	WebDriver driver;
	FileInputStream fs;

	public void readData() throws Exception {

		String path = "E:\\mrunumi\\ReadPropertiesFile\\src\\test\\resources\\data.properties";
		fs = new FileInputStream(path);
		
		Properties prop = new Properties();
		
		prop.load(fs);
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath(prop.getProperty("UserNameXpath")));
		username.sendKeys(prop.getProperty("UserNameValue"));
		WebElement pwd = driver.findElement(By.xpath(prop.getProperty("PasswordXpath")));
		pwd.sendKeys(prop.getProperty("PasswordValue"));

		WebElement loginButton = driver.findElement(By.xpath(prop.getProperty("LoginButtonXpath")));
		loginButton.click();
	}

}
