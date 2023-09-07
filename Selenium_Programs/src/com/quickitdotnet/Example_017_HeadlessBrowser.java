package com.quickitdotnet;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Example_017_HeadlessBrowser {


	public static void main(String[] args) {
		lauchbrowser();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

	public static void lauchbrowser() {
	HtmlUnitDriver unitDriver = new HtmlUnitDriver();
	 unitDriver.get("https://facebook.com/");
		
		//Print the title of the page
	        System.out.println("Title of the page is -> " + unitDriver.getTitle());
	}
	
}
	

