package pom2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class online_shoppingmenandwomen {
	@FindBy(linkText="Women")
	WebElement Women;
	public void Women()
	{
		Women.click();
	}

	@FindBy(linkText="Kids")
	WebElement kids;
	public void kids()
	{
		kids.click();
		
		
	}

	@FindBy(linkText="Home & Living")
	WebElement  Homeliving;
	public void Homeliving()
	{
		Homeliving.click();


	}
	}



}
