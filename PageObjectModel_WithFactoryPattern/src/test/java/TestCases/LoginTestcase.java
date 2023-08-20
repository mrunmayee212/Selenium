package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import TestPages.*;

public class LoginTestcase {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage lp = new LoginPage(driver);
		
		
		lp.enterUserName("Admin");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
		
		lp.enterPassword("admin123");
		
		lp.loginButton();
		
	}

}
