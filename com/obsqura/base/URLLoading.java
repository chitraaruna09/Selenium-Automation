package com.obsqura.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class URLLoading {
	public WebDriver driver;
	
	public WebDriver initializeBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aruna\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		return driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URLLoading obj = new URLLoading();
		obj.initializeBrowser();
	}

}
