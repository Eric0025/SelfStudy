package com.selenium.java.leaning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BasePage {
	
	WebDriver driver;
	
	@Test
	public void startChromeDriver()
	{
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com/");
		
		driver.close();
		driver.quit();
	}

}
