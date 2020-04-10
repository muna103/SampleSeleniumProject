package com.muna.SampleSeleniumProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {

	private WebDriver driver;
	
	@Test
	public void testMethod1() {
		System.setProperty("webdriver.chrome.driver", "F:\\Muna\\SeleniumDependencies\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google","Test case has been passed");
		driver.quit();
	}
}
