package com.obsqura.TestNGAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;

	// user defined method
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aruna\\eclipse-workspace\\TestNGAssignments\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();// driver instantiation
		driver.get("http://www.opesmount.in/grocerystore1/"); // url loading; BaseUrl loading
		driver.manage().window().maximize(); // window maximizing command
	}

	@AfterMethod
	// browser close user defined method
	public void browserClose() {
		driver.close(); // window close command
	}

}
