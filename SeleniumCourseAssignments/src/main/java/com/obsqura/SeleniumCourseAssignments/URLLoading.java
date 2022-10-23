package com.obsqura.SeleniumCourseAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URLLoading {
	public WebDriver driver;
	public WebDriver initializeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aruna\\eclipse-workspace\\SeleniumCourseAssignments\\src\\main\\java\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.scaler.com/topics/java/try-catch-and-finally-in-java/");
		driver.manage().window().maximize(); 
		return driver;
	}
	public void browserClose() {
		driver.close(); //window close command
	}

	/*public static void main(String[] args) {
		URLLoading obj = new URLLoading();
		obj.initializeBrowser();

	}*/

}
