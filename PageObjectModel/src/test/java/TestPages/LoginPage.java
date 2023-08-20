package TestPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	WebDriver driver;
	// locator Strategies OR which only details information about locators

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By username = By.xpath("//input[@name='username']");

	By password = By.xpath("//input[@name='password']");

	By loginButton = By.xpath("//button[@type='submit']");

	public void enterUserName(String uname) {

		driver.findElement(username).sendKeys(uname);
	}

	public void enterPassword(String pwd) {

		driver.findElement(password).sendKeys(pwd);
	}

	public void loginButton() {

		driver.findElement(loginButton).click();
	}

}
