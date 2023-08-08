package com.quickitdotnet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_003_PageTitle {
// Page Source
	// Page Title
	// URL Link

	public static void main(String[] args) {
		launchBrowser();
	}

	public static void launchBrowser() {

		WebDriver browser = new ChromeDriver();

		// browser.get("http://www.makemytrip.com");

		browser.navigate().to("https://www.007.com/");

		String titleofThePage = browser.getTitle();
		System.out.println("The page title is :" + titleofThePage);

		// String pageSource = browser.getPageSource();
		// System.out.println("The pageSource is "+ pageSource);

		String url = browser.getCurrentUrl();
		System.out.println("The current url is " + url);

	}

}
