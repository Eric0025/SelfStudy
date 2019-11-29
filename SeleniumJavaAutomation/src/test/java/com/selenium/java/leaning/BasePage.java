package com.selenium.java.leaning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasePage {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		String chromePath = "src/test/resources/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com/");
		
	
	}

	@Test
	public void verifyPageTileTest()
	{
		String title = driver.getTitle();
		System.out.println("*** Page Title is : " + title);
		
		Assert.assertEquals(title, "Google");
		
	}

	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
