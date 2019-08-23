package pom2;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeGroups;

	public class BaseClass {
		WebDriver driver  =null;
		@BeforeGroups
		public void lunch()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\lonovo\\Desktop\\chromedriver.exe");
			driver=new ChromeDriver();
			String url="https://www.myntra.com";
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		
	//@AfterTest
	public void close()
	{
		driver.close();
	}

	}


}
