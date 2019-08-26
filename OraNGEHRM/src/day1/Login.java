package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login implements Setup {
	private WebDriver driver;
	public void tc_1() {
		System.setProperty(chromekey,chromepath);
	 driver=new ChromeDriver();
	driver.get(url);
	System.out.println("url lunched");
	}
	public void tc_2() {
		driver.findElement(By.id("txtUsername")).sendKeys(id);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("login done");
	}
	public static void main(String[] args) {
		Login l=new Login();
				l.tc_1();
				l.tc_2();
				System.out.println("day1 completed");
	}

}
