package com.obsqura.JUnitSample;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public  WebDriver driver;
	//user defined method
	@Before
	public  void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aruna\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();// driver instantiation
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");  // url loading; BaseUrl loading
		driver.manage().window().maximize(); // window maximizing command
	}
	//browser close user defined method
	public void browserClose() {
		driver.close(); //window close command
	}
	@After
	public  void browserQuit() {
		driver.quit();
	}
}
