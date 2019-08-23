package keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart {

	public static void main(String[] args) {

		
		WebDriver driver =null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();
		String  url ="https://www.amazon.in/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	WebElement women=	driver.findElement(By.id
			("nav-link-accountList"));
	Actions act = new Actions(driver);

	act.moveToElement(women).perform();
	}

}
