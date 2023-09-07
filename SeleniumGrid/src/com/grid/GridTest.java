package com.grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
    public static void main(String[] args) throws MalformedURLException{

        ChromeOptions chromeOptions = new ChromeOptions();
        
        
        
      //  chromeOptions.setBrowserVersion("116");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.9:4444/wd/hub"), chromeOptions);
       //"http://192.168.1.9  Ip Address of node 
        
        // port of hub 
        
        //node: hub
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        
        
    }
}
