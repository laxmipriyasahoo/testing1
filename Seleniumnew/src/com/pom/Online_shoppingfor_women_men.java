package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Online_shoppingfor_women_men {
	@FindBy(linkText = "Men")
	WebElement men;
	public void men()
	{
		men.click();
	}
	@FindBy(linkText="Women")

	WebElement women;
	public void women()
	{
		women.click();
	}
	
}
