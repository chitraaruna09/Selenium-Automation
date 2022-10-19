package com.obsqura.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	
	//user defined method
	public WebDriver initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aruna\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();// driver instantiation
		driver.get("https://www.amazon.in/");  // url loading; BaseUrl loading
		return driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj = new Base();
		obj.initializeBrowser();
	}

}
