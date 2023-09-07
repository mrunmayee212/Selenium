package checkboxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		allcheck();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		multiplecheckbox();
		
	}
	public static void launchbrowser() {
		driver = new ChromeDriver();
		driver.get("https://phptravels.net/admin/hotels.php");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@phptravels.com ");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demoadmin");
	 driver.findElement(By.xpath("//button[@id='submit']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		driver.get("https://phptravels.net/admin/hotels.php");
		//driver.findElement(By.xpath("//*[@id='hotels-collapse']/ul/li[1]/a")).click();
		
	}

	/*
	 * select specific chekbox of persons name
	 * 
	 * how to select all checkbox how to select multiplecheckbox how to select last
	 * 2 checkbox how to select first 2 checkbox
	 */
	public static void allcheck() {

		WebElement e = driver.findElement(By.xpath("//*[@id='select_all']"));
		
		e.click();
	
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e.click();// for deselection of checkbox
		System.out.println("Checkbox is disabled"+ " "+e.isDisplayed());

	}

	public static void lasttwocheckbox() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		List<WebElement> checkboxes = driver.findElements(By.xpath("html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div/input"));
		
		System.out.println(checkboxes.size());

		int totalcheckboxes = checkboxes.size();

		
		  for (int i = totalcheckboxes; i < totalcheckboxes-2; i++) {
		  checkboxes.get(i).click();
		  
		  }
		 
	}

	public static void multiplecheckbox() {
		
		
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[1]/div/input"));
		for (WebElement chbox : checkboxes) {
			WebElement hotelname = chbox.findElement(By.xpath("..//table/tbody/../td[6]"));
			String hotel = hotelname.getText();
			String hotelstartname = hotel.trim().toLowerCase();
        
			if (hotelstartname.startsWith("M".toLowerCase()) || hotelstartname.contains("Grand".toLowerCase())) {
				chbox.click();
				
			}
		}
	}

	public static void firsttwo() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("html/body/main/section/div[2]/div/div/div[1]/div[2]/table/tbody/tr[2]/td[1]/div/input"));
		int totalcheckboxes = checkboxes.size();
		for (int i = 0; i < totalcheckboxes; i++) 
		{
			if (i < 3)
			{
				checkboxes.get(i).click();
				break;
			}

		}
	}
	
	public static void selectedcheckbox() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));
		for (WebElement chbox : checkboxes)
		{
			WebElement manager = chbox.findElement(By.xpath("../../td[4]"));
			String hiringManager = manager.getText();
			WebElement vacancyElement  = chbox.findElement(By.xpath("../../td[2]"));
			String vacancy = vacancyElement.getText();
			//System.out.println(vacancy+" " + hiringManager);
			if (hiringManager.startsWith("Linda") && vacancy.contains("Sales Representative")) 
			{
				chbox.click();
				System.out.println(vacancy+ " "+ hiringManager);
			}
		}
	}


	}


