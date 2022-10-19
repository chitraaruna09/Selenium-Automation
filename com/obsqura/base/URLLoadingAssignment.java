package com.obsqura.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class URLLoadingAssignment {
	
	public WebDriver driver;
	
	public WebDriver initializeBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Aruna\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.opesmount.in/grocerystore1");
		return driver;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URLLoadingAssignment obj = new URLLoadingAssignment();
		obj.initializeBrowser();
	}

}
