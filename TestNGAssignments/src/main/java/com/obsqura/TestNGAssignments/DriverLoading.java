package com.obsqura.TestNGAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverLoading {
	public WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Aruna\\eclipse-workspace\\TestNGAssignments\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void browserClose() {
		driver.close();
	}
	

}
